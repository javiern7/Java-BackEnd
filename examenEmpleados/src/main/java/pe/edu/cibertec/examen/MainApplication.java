package pe.edu.cibertec.examen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pe.edu.cibertec.examen.config.AppConfig;
import pe.edu.cibertec.examen.service.EmployeeService;
import pe.edu.cibertec.examen.util.EmployeeMenu;


public class MainApplication {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService service = context.getBean(EmployeeService.class);
        new EmployeeMenu(service).mostrar();
        context.close();

    }
}
