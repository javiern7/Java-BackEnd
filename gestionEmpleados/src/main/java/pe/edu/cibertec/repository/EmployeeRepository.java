package pe.edu.cibertec.repository;

import pe.edu.cibertec.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    void save(Employee employee);
    Employee findById(int id);
    void update(Employee employee);
    void delete(int id);
    List<Employee> findAll();
}
