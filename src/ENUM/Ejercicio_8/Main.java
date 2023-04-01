package ENUM.Ejercicio_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();


        names.add("Juanito");
        names.add("Shawn");
        names.add("Blake");

        System.out.println(names.get(2));
        System.out.println(names);

        System.out.println("Changing the name of the second student.");
        names.set(2,"Bebe");
        System.out.println(names);

        names.remove(2);

        System.out.println(names);


    }
}