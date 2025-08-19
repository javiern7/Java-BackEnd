package pe.edu.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SaludoController {

    /*@RequestMapping("saludo")
    public String saludar(Model modelo){
        modelo.addAttribute("mensaje","Bienvenido desde el controlador");
        return "saludo";
    }*/

    @RequestMapping("saludo")
    public ModelAndView saludar(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("mensaje","Bienvenido desde el controlador MV");
        mv.setViewName("saludo");
        return mv;
    }
}
