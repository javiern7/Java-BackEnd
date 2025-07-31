/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.capitulo1.v.ejercicio1.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author Usuario
 */
public class Mensajero {
    
    @Value("Equipo JWD otro grupo")
    private String publico;

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }
    
    public void bienvenida(){
        System.out.println("Bienvenido al curso de Spring !!!" + publico);
    }
    
}
