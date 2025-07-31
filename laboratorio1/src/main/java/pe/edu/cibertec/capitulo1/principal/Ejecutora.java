/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.cibertec.capitulo1.principal;

import pe.edu.cibertec.capitulo1.config.AppConfig;
import javax.security.auth.login.AppConfigurationEntry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.edu.cibertec.capitulo1.beans.HolaMundo;

/**
 *
 * @author Usuario
 */
public class Ejecutora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");

        //ConfigurableApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);

        HolaMundo hm = (HolaMundo)contexto.getBean("holaMundoBean");
        hm.saludar();

        HolaMundo hm2 = (HolaMundo)contexto.getBean("holaMundoBean");
        System.out.println("Compara posiciones de memoria = " + hm +" - "+ hm2);
        hm2.setNombre("Segundo Nombre");
        System.out.println("Valor del nombre primer bean " + hm.getNombre());

        ((ConfigurableApplicationContext)contexto).close();
    }
    
}
