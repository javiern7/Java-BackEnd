package pe.edu.cibertec.service;

import pe.edu.cibertec.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void crear(Employee e);
    Employee buscar(int id);
    void actualizar(Employee e);
    void eliminar(int id);
    List<Employee> listarTodos();
}
