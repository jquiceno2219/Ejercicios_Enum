package CRUD.Local_Comercial;

import CRUD.Local_Comercial.Modelo.Store;
import CRUD.Local_Comercial.Repositorio.CrudRepositoryImpl;
import CRUD.Local_Comercial.Repositorio.CrudRepositorio;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Welcome!");
        String opc = "1";
        CrudRepositorio repo = new CrudRepositoryImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("=====Menu===== \n 1. Add Shop \n 2. Show List \n 3. Edit List \n 4. Delete Shop  \n 5. Exit Menu \n =>");
            opc = s.next();
            switch (opc) {
                case "1":{
                    System.out.println("Add Shop Menu: \n Store Id: ");
                    Integer id = s.nextInt();
                    System.out.println("Store Name: ");
                    String storeName = s.next();
                    System.out.println("Store Owner: ");
                    String owner = s.next();
                    System.out.println("Store Contact Phone: ");
                    String phone = s.next();
                    System.out.println("Store Address: ");
                    String address = s.next();
                    System.out.println("Store Category: ");
                    String category = s.next();
                    System.out.println("Description of the store: ");
                    String description = s.next();
                    repo.save(new Store(id, storeName, owner, phone, address, category, description));
                    System.out.println("The Operation has finished. Taking you back to the menu.");
                    break;
                }
                case "2":{
                    List<Store> Shop = repo.findAll();
                    Shop.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("Edit Shop Menu: \n Store Id: ");
                    Integer id = s.nextInt();
                    System.out.println("Store Name: ");
                    String storeName = s.next();
                    System.out.println("Store Owner: ");
                    String owner = s.next();
                    System.out.println("Store Contact Phone: ");
                    String phone = s.next();
                    System.out.println("Address: ");
                    String address = s.next();
                    System.out.println("Store Category: ");
                    String category = s.next();
                    System.out.println("Description of the store: ");
                    String description = s.next();
                    Store beaActualizar = new Store(id, storeName, owner, phone, address, category, description);
                    repo.update(beaActualizar);
                    System.out.println("The Operation has finished. Taking you back to the menu.");
                    break;
                }
                case "4": {
                    System.out.print("Delete Shop Menu: \n Please fill in the store ID: ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
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
        } while (opc != "5");
    }
}
