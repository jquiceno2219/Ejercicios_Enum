package CRUD.Empleados.Repositorio;

import CRUD.Empleados.Modelo.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private List<Employee> employeesList;

    public EmployeeRepositoryImpl() {
        employeesList = new ArrayList<>();
    }

    @Override
    public Employee findById(int id) {
        return employeesList.stream()
                .filter(employeefilter -> employeefilter.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Employee> findAll() {
        return employeesList;
    }

    @Override
    public void save(Employee employee) {
        employeesList.add(employee);
    }

    @Override
    public void update(Employee employee) {
        Employee oldEmployee = findById(employee.getId());
        if (oldEmployee != null) {
            employeesList.remove(oldEmployee);
            employeesList.add(employee);
        }
    }

    @Override
    public void delete(Employee employee) {
        employeesList.remove(employee);
    }
}