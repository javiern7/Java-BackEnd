package pe.edu.cibertec.repository;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.entity.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryEmployeeRepository implements EmployeeRepository {
    private final List<Employee> empleados = new ArrayList<>();

    public InMemoryEmployeeRepository (){
        Employee empleado1 = new Employee(1,"Juan Perez","Softaware Engineer 1",3000.00);
        Employee empleado2 = new Employee(2,"Pedro Castañeda","Tech Lead",8000.00);
        Employee empleado3 = new Employee(3,"Karina Pajuelo","Softaware Engineer 2",5000.00);
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
    }

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
