package pe.edu.cibertec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.edu.cibertec.util.EmployeeMenu;
import pe.edu.cibertec.service.EmployeeService;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService service = context.getBean("employeeService", EmployeeService.class);
        new EmployeeMenu(service).mostrar();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
