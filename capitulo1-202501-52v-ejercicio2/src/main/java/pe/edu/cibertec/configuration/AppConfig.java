package pe.edu.cibertec.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pe.edu.cibertec.bean.Cliente;
import pe.edu.cibertec.service.impl.EmailService;
import pe.edu.cibertec.service.impl.SMSService;

@Configuration
@ComponentScan(basePackages = {"pe.edu.cibertec"})
public class AppConfig {

/*    @Bean
    public EmailService emailService() {
        return new EmailService();
    }

    @Bean
    public SMSService smsService() {
        return new SMSService();
    }

    @Bean
    public Cliente cliente() {
        return new Cliente();
    }*/


}
