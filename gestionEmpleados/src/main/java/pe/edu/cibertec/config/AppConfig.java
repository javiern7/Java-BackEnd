package pe.edu.cibertec.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "pe.edu.cibertec")
@EnableAspectJAutoProxy
public class AppConfig {
}
