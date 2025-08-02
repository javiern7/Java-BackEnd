package pe.edu.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.entity.Employee;
import pe.edu.cibertec.repository.EmployeeRepository;
import pe.edu.cibertec.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final double SALARIO_MINIMO = 1025.0;
    @Autowired
    private EmployeeRepository repository;

    /*public void setRepository(EmployeeRepository repository) {
        this.repository = repository;
    }*/

    @Override
    public void crear(Employee e) {
        if (repository.findById(e.getId()) != null) {
            throw new IllegalArgumentException("El ID ya está registrado.");
        }
        validarSalario(e.getSalario());
        repository.save(e);
    }

    @Override
    public Employee buscar(int id) {
        Employee emp = repository.findById(id);
        if (emp == null) {
            throw new IllegalArgumentException("No existe un empleado con ID: " + id);
        }
        return emp;
    }

    @Override
    public void actualizar(Employee e) {
        if (repository.findById(e.getId()) == null) {
            throw new IllegalArgumentException("Empleado no encontrado.");
        }
        validarSalario(e.getSalario());
        repository.update(e);
    }

    @Override
    public void eliminar(int id) {
        if (repository.findById(id) == null) {
            throw new IllegalArgumentException("Empleado no existe.");
        }
        repository.delete(id);
    }

    @Override
    public List<Employee> listarTodos() {
        List<Employee> empleados = repository.findAll();
        if (empleados == null || empleados.isEmpty()) {
            throw new IllegalStateException("No hay empleados registrados.");
        }
        return empleados;
    }

    private void validarSalario(double salario) {
        if (salario < SALARIO_MINIMO) {
            throw new IllegalArgumentException("El salario no puede ser menor a S/. " + SALARIO_MINIMO);
        }
    }
}
