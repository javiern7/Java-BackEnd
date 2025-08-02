package pe.edu.cibertec.capitulo1.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class PerformanceAOP {
    public Object medirTiempo(ProceedingJoinPoint pjp) throws Throwable {
        long tInicio = System.currentTimeMillis();
        Object resultado = pjp.proceed();
        long tFinal = System.currentTimeMillis();
        System.out.println("PERF: Metodo " + pjp.getSignature().getName() + "ejecutado en: " + (tFinal - tInicio) + " ms");

        return resultado;
    }
}
