package pe.edu.cibertec.service;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Service;

@Service
public class AuditoriaAOP {

    public void alertaAntes(JoinPoint jp){
        System.out.println("*************************************");
        System.out.println("Auditoria ANTES del metodo " + jp.getSignature());
        System.out.println("*************************************");
    }

    public void alertaDespues(JoinPoint jp){
        System.out.println("**************************************");
        System.out.println("Auditoria DESPUES del metodo " + jp.getSignature());
        System.out.println("**************************************");
    }

    public void alertaException(JoinPoint jp){
        System.out.println("**************************************");
        System.out.println("Auditoria en la EXCEPCION " + jp.getSignature());
        System.out.println("**************************************");
    }
}
