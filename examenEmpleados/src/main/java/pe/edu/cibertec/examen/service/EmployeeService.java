package pe.edu.cibertec.examen.service;

import pe.edu.cibertec.examen.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void crear(Employee e);
    Employee buscar(int id);
    void actualizar(Employee e);
    void eliminar(int id);
    List<Employee> listarTodos();
}
