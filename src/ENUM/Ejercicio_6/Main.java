package ENUM.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //create list of lists
        List<ArrayList<String>> java_listOfLists = new ArrayList<ArrayList<String>>();
        //create a language list and add elements to it
        ArrayList<String> language_list = new ArrayList<String>();
        language_list.add("English");
        language_list.add("Spanish");
        language_list.add("German");
        //add language list to java list of list
        java_listOfLists.add(language_list);

        //create a city list and add elements to it
        ArrayList<String> city_list = new ArrayList<String>();
        city_list.add("N.Y.");
        city_list.add("Bogotá");
        //add the city list to java list of lists
        java_listOfLists.add(city_list);

        //display the contents of list of lists
        System.out.println("Java list of lists contents:");
        java_listOfLists.forEach((list)  ->                 //access each list
        {
            list.forEach((city)->System.out.print(city + " ")); //each element of inner list
        });
    }
}