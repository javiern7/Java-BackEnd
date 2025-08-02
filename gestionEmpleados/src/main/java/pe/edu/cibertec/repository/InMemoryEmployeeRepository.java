package pe.edu.cibertec.repository;

import pe.edu.cibertec.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class InMemoryEmployeeRepository implements EmployeeRepository {
    private final List<Employee> empleados = new ArrayList<>();

    @Override
    public void save(Employee e) {
        empleados.add(e);
    }

    @Override
    public Employee findById(int id) {
        return empleados.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void update(Employee updated) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId() == updated.getId()) {
                empleados.set(i, updated);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        empleados.removeIf(e -> e.getId() == id);
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(empleados);
    }
}
