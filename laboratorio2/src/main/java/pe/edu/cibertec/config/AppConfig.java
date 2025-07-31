package pe.edu.cibertec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.cibertec.beans.DocumentoExcel;
import pe.edu.cibertec.beans.DocumentoTexto;
import pe.edu.cibertec.service.ImpresoraService;

@Configuration
public class AppConfig {

    @Bean
    public DocumentoExcel documentoExcel(){
        return new DocumentoExcel();
    }

    @Bean
    public DocumentoTexto documentoTexto(){
        return new DocumentoTexto();
    }

    @Bean
    public ImpresoraService impresoraService(){
        return new ImpresoraService();
    }

}
