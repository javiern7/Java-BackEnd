package pe.edu.cibertec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.edu.cibertec.bean.Cliente;
import pe.edu.cibertec.configuration.AppConfig;

public class Principal {
    public static void main(String[] args) {

       ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
        //ApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
        Cliente cliente = contexto.getBean("cliente",Cliente.class);
        cliente.procesarMensaje("Hola! Utilizando Interfaces para los ejemplos");

        ((ConfigurableApplicationContext)contexto).close();

    }
}
