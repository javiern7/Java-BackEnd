package pe.edu.cibertec.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import pe.edu.cibertec.service.MensajeService;

public class Cliente {

    @Autowired
    @Qualifier("emailService")
    private MensajeService mensajeService;

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
