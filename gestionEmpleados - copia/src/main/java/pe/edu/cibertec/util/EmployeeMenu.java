package pe.edu.cibertec.util;

import pe.edu.cibertec.entity.Employee;
import pe.edu.cibertec.service.EmployeeService;

import java.util.Scanner;

public class EmployeeMenu {
    private final EmployeeService service;
    private final Scanner sc = new Scanner(System.in);

    public EmployeeMenu(EmployeeService service) {
        this.service = service;
    }

    public void mostrar() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== MENÚ EMPLEADOS ===");
            System.out.println("1. Crear empleado");
            System.out.println("2. Buscar empleado");
            System.out.println("3. Actualizar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Listar empleados");
            System.out.println("0. Salir");
            int opcion = leerEntero("Seleccione opción: ");

            switch (opcion) {
                case 1 -> crear();
                case 2 -> buscar();
                case 3 -> actualizar();
                case 4 -> eliminar();
                case 5 -> listar();
                case 0 -> {
                    System.out.println("👋 Hasta pronto.");
                    salir = true;
                }
                default -> System.out.println("❗ Opción inválida.");
            }
        }
    }

    private void crear() {
        System.out.println("\n📌 Crear nuevo empleado:");
        int id;
        boolean idValido = false;

        do {
            id = leerEntero("ID: ");
            if (id <= 0) {
                System.out.println("🚫 El ID debe ser mayor a cero.");
                continue;
            }
            try {
                service.buscar(id);
                System.out.println("🚫 El ID ya está en uso. Ingrese otro.");
            } catch (IllegalArgumentException e) {
                idValido = true;
            }
        } while (!idValido);

        String nombre = leerTexto("Nombre: ");
        String cargo = leerTexto("Cargo: ");

        double salario;
        boolean salarioValido = false;

        do {
            salario = leerDouble("Salario: ");
            try {
                service.crear(new Employee(id, nombre, cargo, salario));
                System.out.println("✅ Empleado registrado.");
                salarioValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("🚫 " + e.getMessage());
            }
        } while (!salarioValido);
    }

    private void buscar() {
        System.out.println("\n🔍 Buscar empleado:");
        boolean consultaExitosa = false;

        do {
            int id = leerEntero("ID: ");
            if (id <= 0) {
                System.out.println("🚫 El ID debe ser mayor a cero.");
                continue;
            }
            try {
                Employee emp = service.buscar(id);
                System.out.println(emp);
                consultaExitosa = true;
            } catch (IllegalArgumentException e) {
                System.out.println("⚠️ " + e.getMessage());
            }
        } while (!consultaExitosa);
    }

    private void actualizar() {
        System.out.println("\n✏️ Actualizar empleado:");
        int id;
        boolean idExistente = false;

        do {
            id = leerEntero("ID: ");
            if (id <= 0) {
                System.out.println("🚫 El ID debe ser mayor a cero.");
                continue;
            }
            try {
                service.buscar(id);
                idExistente = true;
            } catch (IllegalArgumentException e) {
                System.out.println("🚫 " + e.getMessage());
            }
        } while (!idExistente);

        String nombre = leerTexto("Nuevo nombre: ");
        String cargo = leerTexto("Nuevo cargo: ");

        double salario;
        boolean actualizado = false;

        do {
            salario = leerDouble("Nuevo salario: ");
            try {
                service.actualizar(new Employee(id, nombre, cargo, salario));
                System.out.println("✅ Empleado actualizado.");
                actualizado = true;
            } catch (IllegalArgumentException e) {
                System.out.println("🚫 " + e.getMessage());
            }
        } while (!actualizado);
    }

    private void eliminar() {
        System.out.println("\n🗑️ Eliminar empleado:");
        boolean eliminado = false;

        do {
            int id = leerEntero("ID: ");
            if (id <= 0) {
                System.out.println("🚫 El ID debe ser mayor a cero.");
                continue;
            }
            try {
                service.eliminar(id);
                System.out.println("✅ Empleado eliminado.");
                eliminado = true;
            } catch (IllegalArgumentException e) {
                System.out.println("🚫 " + e.getMessage());
            }
        } while (!eliminado);
    }

    private void listar() {
        System.out.println("\n📋 Lista de empleados:");
        try {
            var empleados = service.listarTodos();
            empleados.forEach(System.out::println);
        } catch (IllegalStateException e) {
            System.out.println("⚠️ " + e.getMessage());
        }
    }

    // Métodos utilitarios
    private int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un número entero válido.");
            }
        }
    }

    private double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingrese un valor numérico válido.");
            }
        }
    }

    private String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }
}
