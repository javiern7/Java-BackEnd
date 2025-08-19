package pe.edu.cibertec.examen.util;

import pe.edu.cibertec.examen.entity.Employee;
import pe.edu.cibertec.examen.service.EmployeeService;

public class EmployeeActionHandler {
    private final EmployeeService service;
    private final EmployeeValidateHandler validate;

    public EmployeeActionHandler(EmployeeService service, EmployeeValidateHandler validate) {
        this.service = service;
        this.validate = validate;
    }

    public EmployeeValidateHandler getInputHandler() {
        return validate;
    }

    public void crear() {
        System.out.println("\nCrear nuevo empleado:");
        int id;
        do {
            id = validate.leerEntero("ID: ");
            if (id <= 0) {
                System.out.println("El ID debe ser mayor a cero.");
                continue;
            }
            try {
                service.buscar(id);
                System.out.println("El ID ya está en uso.");
            } catch (IllegalArgumentException e) {
                break;
            }
        } while (true);

        String nombre = validate.leerTexto("Nombre: ");
        String cargo = validate.leerTexto("Cargo: ");

        do {
            double salario = validate.leerDouble("Salario: ");
            try {
                service.crear(new Employee(id, nombre, cargo, salario));
                System.out.println("Empleado registrado.");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public void buscar() {
        System.out.println("\nBuscar empleado:");
        int id = validate.leerEntero("ID: ");
        try {
            System.out.println(service.buscar(id));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void actualizar() {
        System.out.println("\nActualizar empleado:");
        int id = validate.leerEntero("ID: ");
        try {
            service.buscar(id);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String nombre = validate.leerTexto("Nuevo nombre: ");
        String cargo = validate.leerTexto("Nuevo cargo: ");
        double salario = validate.leerDouble("Nuevo salario: ");

        try {
            service.actualizar(new Employee(id, nombre, cargo, salario));
            System.out.println("Empleado actualizado.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminar() {
        System.out.println("\nEliminar empleado:");
        int id = validate.leerEntero("ID: ");
        try {
            service.eliminar(id);
            System.out.println("Empleado eliminado.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listar() {
        System.out.println("\nLista de empleados:");
        try {
            service.listarTodos().forEach(System.out::println);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}