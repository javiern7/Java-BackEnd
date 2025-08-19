package pe.edu.cibertec.capitulo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AcercaController {
    @RequestMapping("acercade")
    public ModelAndView acerca(){
        /*ModelAndView respuesta = new ModelAndView();
        respuesta.addObject("otroMensaje", "Mensaje Utilizando MOdel And View");
        respuesta.setViewName("acercade");*/
        ModelAndView respuesta = new ModelAndView("acercade","otromensaje","Mensaje Utilizando MOdel And View");
        return respuesta;
    }
}
