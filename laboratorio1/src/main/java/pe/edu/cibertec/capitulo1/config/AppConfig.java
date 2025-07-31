package pe.edu.cibertec.capitulo1.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.cibertec.capitulo1.beans.HolaMundo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
@Configuration
public class AppConfig {
    @Bean
    public HolaMundo holaMundoBean(){
        return new HolaMundo();
    }
}
