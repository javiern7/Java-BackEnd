package pe.edu.cibertec.examen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "pe.edu.cibertec.examen")
@EnableAspectJAutoProxy
public class AppConfig {
}
