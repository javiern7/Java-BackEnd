package pe.edu.cibertec.model;

public class Employee {

    private int id;
    private String nombre;
    private String cargo;
    private double salario;

    public Employee() {}

    public Employee(int id, String nombre, String cargo, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Employee setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public Employee setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public double getSalario() {
        return salario;
    }

    public Employee setSalario(double salario) {
        this.salario = salario;
        return this;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Nombre: %s | Cargo: %s | Salario: %.2f", id, nombre, cargo, salario);
    }
}
