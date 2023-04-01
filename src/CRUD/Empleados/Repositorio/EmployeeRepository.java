package CRUD.Empleados.Repositorio;

import CRUD.Empleados.Modelo.Employee;

import java.util.List;

public interface EmployeeRepository {
    Employee findById(int id);
    List<Employee> findAll();
    void save(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);
}