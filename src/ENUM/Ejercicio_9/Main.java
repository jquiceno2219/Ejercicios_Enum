package ENUM.Ejercicio_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Math");
        list.add("English");
        list.add("Chemistry");
        list.add("Physics");

        for(Object element : list){
            System.out.println(element);
        }}
}