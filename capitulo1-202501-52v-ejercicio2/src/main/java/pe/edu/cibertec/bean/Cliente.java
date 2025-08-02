package pe.edu.cibertec.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.service.MensajeService;

@Service()
public class Cliente {

    @Autowired
    @Qualifier("emailService")
    private MensajeService mensajeService;

    public void init(){
        System.out.println("********************************************");
        System.out.println("El Bean Cliente ya se encuentra listo");
        System.out.println("*********************************************");
    }

    public void destroy(){
        System.out.println("*********************************************");
        System.out.println("El Bean Cliente sera destruido");
        System.out.println("*****************************************");
    }

    public void setMensajeService(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }

    //public Cliente(MensajeService mensajeService) {
    //    this.mensajeService = mensajeService;
    //}

    public void procesarMensaje(String mensaje) {
        mensajeService.enviarMensaje(mensaje);
    }
}
