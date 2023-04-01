package CRUD.Empleados;

import CRUD.Empleados.Modelo.Employee;
import CRUD.Empleados.Repositorio.EmployeeRepositoryImpl;
import CRUD.Empleados.Repositorio.EmployeeRepository;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opc = "1";
        EmployeeRepository repo = new EmployeeRepositoryImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("MENU \n 1. Add Employee \n 2. List Employees \n 3. Edit Employee " +
                    "\n 4. Delete Employee \n 5. Exit \n =>");
            opc = s.next();
            switch (opc) {
                case "1":
                {
                    System.out.println("Employee Id: ");
                    Integer id = s.nextInt();
                    System.out.println("Employee Name: ");
                    String name = s.next();
                    System.out.println("Employee Phone: ");
                    Long phone = s.nextLong();
                    System.out.println("Employee Age: ");
                    Short age = s.nextShort();
                    System.out.println("Employee Position: ");
                    String position = s.next();
                    repo.save(new Employee(id, name, age, phone, position));
                    break;
                }
                case "2":
                {
                    List<Employee> employees = repo.findAll();
                    employees.forEach(System.out::println);
                    break;
                }
                case "3":
                {
                    System.out.println("===== Edit Employee =====");
                    System.out.println("Employee Id: ");
                    Integer id = s.nextInt();
                    System.out.println("Enter the Employee Name: ");
                    String name = s.next();
                    System.out.println("Enter the Employee Phone: ");
                    Long phone = s.nextLong();
                    System.out.println("Enter the Employee Age: ");
                    Short age = s.nextShort();
                    System.out.println("Enter the Employee Position: ");
                    String position = s.next();
                    Employee employeeUpdate = new Employee(id, name, age, phone, position);
                    repo.update(employeeUpdate);
                    System.out.println("The Operation has finished. Taking you back to the menu.");
                    break;
                }
                case "4":
                {
                    System.out.println("===== Delete Employee =====");
                    System.out.println("Enter the Employee Id: ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
                    repo.findAll().forEach(System.out::println);
                    System.out.println("The Operation has finished. Taking you back to the menu.");
                    break;
                }
                case "5":
                {
                    opc = "5";
                    System.out.println("The Operation has finished.");
                    break;
                }
            }
        } while (!opc.equals("5"));
    }
}