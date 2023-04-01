package CRUD.VehicleWorkflow;
import CRUD.VehicleWorkflow.Modelo.Workshop;
import CRUD.VehicleWorkflow.Repositorio.CrudRepositorioImpl;
import CRUD.VehicleWorkflow.Repositorio.CrudRepositorio;


import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String opc = "1";
        CrudRepositorio repo = new CrudRepositorioImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("===== Menu ===== \n 1. Add \n 2. Show List \n 3. Edit Vehicle Workflow " +
                    "\n 4. Delete Vehicle \n 5. Exit \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Vehicle License Plate:");
                    Integer licensePlate = s.nextInt();
                    System.out.println("Owner:");
                    String owner = s.next();
                    System.out.println("Entry Date:");
                    String date = s.next();
                    System.out.println("Owner's Phone Number: ");
                    long phone = s.nextInt();
                    System.out.println("Car Model:");
                    String model = s.next();
                    System.out.println("Car Brand:");
                    String brand = s.next();
                    repo.save(new Workshop(licensePlate, owner, date, phone, model, brand));
                    System.out.println("The Operation has finished. Taking you back to the menu.");
                    break;
                }
                case "2": {
                    List<Workshop> workshops = repo.findAll();
                    workshops.forEach(System.out::println);
                    System.out.println("The Operation has finished. Taking you back to the menu.");
                    break;
                }
                case "3": {
                    System.out.println("===== Edit ====");
                    System.out.println("Vehicle License Plate:");
                    Integer licensePlate = s.nextInt();
                    System.out.println("Owner:");
                    String owner = s.next();
                    System.out.println("Entry Date: ");
                    String date = s.next();
                    System.out.println("Owner's Phone Number: ");
                    long phone = s.nextInt();
                    System.out.println("Car Model:");
                    String model = s.next();
                    System.out.println("Car Brand:");
                    String brand = s.next();
                    Workshop beaToUpdate = new Workshop(licensePlate, owner, date, phone, model, brand);
                    repo.update(beaToUpdate);
                    System.out.println("The Operation has finished. Taking you back to the menu.");
                    break;
                }
                case "4": {
                    System.out.println("===== Delete ======");
                    System.out.print("Enter the Vehicle License Plate:");
                    Integer licensePlate = s.nextInt();
                    repo.delete(repo.findByPlate(licensePlate));
                    repo.findAll().forEach(System.out::println);
                    System.out.println("The Operation has finished. Taking you back to the menu.");
                    break;
                }
                case "5": {
                    opc = "5";
                    System.out.println("The Operation has finished.");
                    break;
                }
            }
        } while (!opc.equals("5"));
    }
}
