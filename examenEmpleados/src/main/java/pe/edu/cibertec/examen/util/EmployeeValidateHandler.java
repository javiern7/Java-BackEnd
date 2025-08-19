package pe.edu.cibertec.examen.util;

import java.util.Scanner;

public class EmployeeValidateHandler {
    private final Scanner sc = new Scanner(System.in);

    public int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número entero válido.");
            }
        }
    }

    public double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un valor numérico válido.");
            }
        }
    }

    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }
}
