package pe.edu.cibertec.capitulo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.cibertec.capitulo2.dto.UserDto;
import pe.edu.cibertec.capitulo2.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


@Controller
@SessionAttributes("contadorUserSave")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("usuario")
    public String usuario(Model modelo){
        modelo.addAttribute("mimensaje","Bienvenidos alumnos del 202501-52V");
        return "usuario";
    }

    @RequestMapping("userLogin")
    public ModelAndView userLogin(UserDto userView){
        ModelAndView respuesta = null;

        UserDto userValidate = service.validaLogin(userView);
        if(userValidate==null){
            respuesta = new ModelAndView("login","mensajeError","Credenciales Invalidas !!!");
        }else{
            respuesta = new ModelAndView("usuario","lista",service.listaUsuarios());
            respuesta.addObject("contadorUserSave",0);
        }
        return respuesta;
    }

    @RequestMapping("mostrarLogin")
    public String mostrarLogin(){
        return "login";
    }

    @RequestMapping("userNew")
    public ModelAndView userNew(){
        return new ModelAndView("userdata","usuarioBean",new UserDto());
    }

    @RequestMapping("userSave")
    public ModelAndView userSave(@Valid @ModelAttribute("usuarioBean") UserDto usuario
                                , BindingResult resultado, ModelMap modelo){
        ModelAndView respuesta = null;
        if(resultado.hasErrors()){
            respuesta = new ModelAndView("userdata","usuarioBean",usuario);
        }else{
            service.insertarUsuario(usuario);
            int contadorUser= (int)modelo.get("contadorUserSave");
            respuesta = new ModelAndView("usuario","lista",service.listaUsuarios());
            contadorUser++;
            respuesta.addObject("contadorUserSave",contadorUser);
        }
        return respuesta;
    }

    @RequestMapping("photoShow")
    public String photoShow(HttpServletRequest request, Model modelo) {
        UserDto usuario = service.obtenerUser(request.getParameter("codigoUsuario"));
        modelo.addAttribute("usuario", usuario);
        return "photoUser";
    }

    @RequestMapping("photoSave")
    public ModelAndView photoSave(@RequestParam("archivo") CommonsMultipartFile archivo,
                                   @RequestParam("codigoUsuario") String codigoUsuario) {

        UserDto usuario = service.obtenerUser(codigoUsuario);
        usuario.setFoto(archivo.getBytes());

        return new ModelAndView("usuario", "lista", service.listaUsuarios());
    }

}
