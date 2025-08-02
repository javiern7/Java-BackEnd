package pe.edu.cibertec.util;

import pe.edu.cibertec.model.Employee;
import pe.edu.cibertec.service.EmployeeService;

import java.util.Scanner;

public class EmployeeMenu {
    private final EmployeeService service;
    private final Scanner sc = new Scanner(System.in);

    public EmployeeMenu(EmployeeService service) {
        this.service = service;
    }

    public void mostrar() {
        int opcion;

        do {
            System.out.println("\n=== MENÚ EMPLEADOS ===");
            System.out.println("1. Crear empleado");
            System.out.println("2. Buscar empleado");
            System.out.println("3. Actualizar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Listar empleados");
            System.out.println("0. Salir");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> crear();
                case 2 -> buscar();
                case 3 -> actualizar();
                case 4 -> eliminar();
                case 5 -> listar();
                case 0 -> System.out.println("Hasta pronto");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 0);
    }

    private void crear() {
        System.out.print("ID: "); int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: "); String nombre = sc.nextLine();
        System.out.print("Cargo: "); String cargo = sc.nextLine();
        System.out.print("Salario: "); double salario = sc.nextDouble();
        service.crear(new Employee(id, nombre, cargo, salario));
    }

    private void buscar() {
        System.out.print("ID: "); int id = sc.nextInt();
        Employee e = service.buscar(id);
        System.out.println(e != null ? e : "Empleado no encontrado");
    }

    private void actualizar() {
        System.out.print("ID: "); int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo Nombre: "); String nombre = sc.nextLine();
        System.out.print("Nuevo Cargo: "); String cargo = sc.nextLine();
        System.out.print("Nuevo Salario: "); double salario = sc.nextDouble();
        service.actualizar(new Employee(id, nombre, cargo, salario));
    }

    private void eliminar() {
        System.out.print("ID: "); int id = sc.nextInt();
        service.eliminar(id);
    }

    private void listar() {
        service.listarTodos().forEach(System.out::println);
    }
}
