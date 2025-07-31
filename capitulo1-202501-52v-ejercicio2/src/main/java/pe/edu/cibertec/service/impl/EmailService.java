package pe.edu.cibertec.service.impl;

import pe.edu.cibertec.service.MensajeService;

public class EmailService implements MensajeService {

    public void init(){
        System.out.println("********************************************");
        System.out.println("El Bean EmailService ya se encuentra listo");
        System.out.println("*********************************************");
    }

    public void destroy(){
        System.out.println("*********************************************");
        System.out.println("El Bean EmailService sera destruido");
        System.out.println("*****************************************");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("*******************************************");
        System.out.println("Enviando Mensaje por email:  " + mensaje);
        System.out.println("*******************************************");
    }
}
