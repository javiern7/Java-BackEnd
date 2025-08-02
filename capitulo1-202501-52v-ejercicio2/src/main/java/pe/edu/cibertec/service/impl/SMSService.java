package pe.edu.cibertec.service.impl;

import org.springframework.stereotype.Controller;
import pe.edu.cibertec.service.MensajeService;

@Controller
public class SMSService implements MensajeService {

    public void init(){
        System.out.println("********************************************");
        System.out.println("El Bean SMSService ya se encuentra listo");
        System.out.println("*********************************************");
    }

    public void destroy(){
        System.out.println("*********************************************");
        System.out.println("El Bean SMSService sera destruido");
        System.out.println("*****************************************");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("*******************************************");
        System.out.println("Enviando Mensaje SMS:  " + mensaje);
        System.out.println("*******************************************");
    }
}
