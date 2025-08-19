package pe.edu.cibertec.examen.util;


import pe.edu.cibertec.examen.service.EmployeeService;

public class EmployeeMenu {
    private final EmployeeActionHandler actionHandler;

    public EmployeeMenu(EmployeeService service) {
        this.actionHandler = new EmployeeActionHandler(service, new EmployeeValidateHandler());
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

            int opcion = actionHandler.getInputHandler().leerEntero("Seleccione opción: ");

            switch (opcion) {
                case 1 -> actionHandler.crear();
                case 2 -> actionHandler.buscar();
                case 3 -> actionHandler.actualizar();
                case 4 -> actionHandler.eliminar();
                case 5 -> actionHandler.listar();
                case 0 -> {
                    System.out.println("Hasta pronto.");
                    salir = true;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }
}
