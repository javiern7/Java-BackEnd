package pe.edu.cibertec.examen.repository;



import pe.edu.cibertec.examen.entity.Employee;

import java.util.List;

public interface EmployeeRepository {
    void save(Employee employee);
    Employee findById(int id);
    void update(Employee employee);
    void delete(int id);
    List<Employee> findAll();
}
