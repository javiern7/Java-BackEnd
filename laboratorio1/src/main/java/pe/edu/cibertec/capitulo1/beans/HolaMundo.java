/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.capitulo1.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author Usuario
 */
public class HolaMundo {
    
    
    @Value("Alumnos desde anotaciones!!!")
    private String nombre;
    
    public void saludar(){
        System.out.println("Saludando desde Spring a " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
