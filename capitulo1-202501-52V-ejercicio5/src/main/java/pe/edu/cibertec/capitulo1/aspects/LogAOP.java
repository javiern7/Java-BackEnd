package pe.edu.cibertec.capitulo1.aspects;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class LogAOP {
    public void logginAntes(JoinPoint joinPoint) {
        System.out.println("LOG: Antes del metodo" + joinPoint.getSignature());

    }

    public void logginDespues(JoinPoint joinPoint){
        System.out.println("LOG: Despues del metodo" + joinPoint.getSignature());
    }

    public void logginException(JoinPoint joinPoint){
        System.out.println("LOG: Despues del metodo" + joinPoint.getSignature());
    }
}
