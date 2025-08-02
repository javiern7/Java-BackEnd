package pe.edu.cibertec.service.impl;

import pe.edu.cibertec.model.Employee;
import pe.edu.cibertec.repository.EmployeeRepository;
import pe.edu.cibertec.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private static final double SALARIO_MINIMO = 1025.0;

    private EmployeeRepository repository;

    public void setRepository(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void crear(Employee e) {
        if (repository.findById(e.getId()) != null) {
            throw new IllegalArgumentException("El empleado con ID " + e.getId() + " ya existe.");
        }
        if (e.getSalario() < SALARIO_MINIMO) {
            throw new IllegalArgumentException("El salario no puede ser menor a S/. " + SALARIO_MINIMO);
        }
        repository.save(e);
    }

    @Override
    public Employee buscar(int id) {
        return repository.findById(id);
    }

    @Override
    public void actualizar(Employee e) {
        if (repository.findById(e.getId()) == null) {
            throw new IllegalArgumentException("Empleado no encontrado.");
        }
        if (e.getSalario() < SALARIO_MINIMO) {
            throw new IllegalArgumentException("Salario inválido. Debe ser mayor o igual a " + SALARIO_MINIMO);
        }
        repository.update(e);
    }

    @Override
    public void eliminar(int id) {
        repository.delete(id);
    }

    @Override
    public List<Employee> listarTodos() {
        return repository.findAll();
    }
}
