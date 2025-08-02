package pe.edu.cibertec.capitulo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.edu.cibertec.capitulo1.service.ClienteService;

public class Ejecutora {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClienteService clienteService = context.getBean(ClienteService.class);
        clienteService.registrarCliente("Dennys Jimenez");

    }
}
