package pe.edu.cibertec.service;

import org.springframework.stereotype.Service;

@Service
public class AuditoriaAOP {

    public void alertaAntes(){
        System.out.println("*************************************");
        System.out.println("Auditoria ANTES del metodo");
        System.out.println("*************************************");
    }

    public void alertaDespues(){
        System.out.println("**************************************");
        System.out.println("Auditoria DESPUES del metodo");
        System.out.println("**************************************");
    }

    public void alertaException(){
        System.out.println("**************************************");
        System.out.println("Auditoria en la EXCEPCION");
        System.out.println("**************************************");
    }
}
