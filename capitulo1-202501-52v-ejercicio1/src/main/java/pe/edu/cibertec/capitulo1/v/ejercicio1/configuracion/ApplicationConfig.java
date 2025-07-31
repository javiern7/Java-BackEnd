/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.capitulo1.v.ejercicio1.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.cibertec.capitulo1.v.ejercicio1.beans.Mensajero;

/**
 *
 * @author Usuario
 */
@Configuration
public class ApplicationConfig {
    
    @Bean
    public Mensajero mensajero(){
        return new Mensajero();
    }
}
