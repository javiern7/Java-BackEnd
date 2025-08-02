package pe.edu.cibertec.principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.edu.cibertec.beans.DocumentoExcel;
import pe.edu.cibertec.beans.HolaMundo;
import pe.edu.cibertec.config.AppConfig;
import pe.edu.cibertec.service.ImpresoraService;

public class Ejecutora {
    public static void main(String[] args) {

        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");

        HolaMundo hm = (HolaMundo)contexto.getBean("holaMundoBean");
        hm.saludar();

        HolaMundo hm2 = (HolaMundo)contexto.getBean("holaMundoBean");
        System.out.println("Compara posiciones de memoria = " + hm +" - "+ hm2);
        hm2.setNombre("Segundo Nombre");
        System.out.println("Valor del nombre primer bean " + hm.getNombre());

        //ApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
        ImpresoraService impresoraService = (ImpresoraService) contexto.getBean("impresoraServiceBean");
        impresoraService.imprimirDocumento();


        ((ConfigurableApplicationContext) contexto).close();
    }
}
