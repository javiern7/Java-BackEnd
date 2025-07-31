/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.capitulo1.v.ejercicio1.principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.edu.cibertec.capitulo1.v.ejercicio1.beans.Mensajero;
import pe.edu.cibertec.capitulo1.v.ejercicio1.configuracion.ApplicationConfig;

/**
 *
 * @author Usuario
 */
public class Ejecutora {
    public static void main(String[] args) {
        
        ApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ApplicationContext contexto = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        //Mensajero miMensaje = (Mensajero) contexto.getBean("mensajero");
        Mensajero miMensajero = contexto.getBean("mensajero",Mensajero.class);
        miMensajero.bienvenida();

        Mensajero otroMensajero = contexto.getBean("mensajero",Mensajero.class);
        System.out.println("*************************************************************");
        System.out.println("Posicion de memoria de miMensajero: " + miMensajero);
        System.out.println("*************************************************************");
        System.out.println("Posicion de memoria de otroMensajero: " + otroMensajero);
        System.out.println("*************************************************************");

        
        ((ConfigurableApplicationContext)contexto).close();
                
                
    }
            
    
}
