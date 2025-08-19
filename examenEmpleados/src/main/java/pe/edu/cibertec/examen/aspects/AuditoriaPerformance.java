package pe.edu.cibertec.examen.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditoriaPerformance {
    @Around("execution(* pe.edu.cibertec.examen.service.*.*(..))")
    public Object medirTiempo(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        // Simular retardo de 500 ms
        Thread.sleep(500);
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("[LOG] Tiempo de ejecución: " + (end - start) + " ms - Método: " + joinPoint.getSignature().getName());
        return result;
    }
}
