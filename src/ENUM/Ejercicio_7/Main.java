package ENUM.Ejercicio_7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbersUntilTen = new ArrayList<>();


        for (int i = 0; i <= 10; i++) {
            numbersUntilTen.add(i);
        }
        System.out.println(numbersUntilTen);

        int num = numbersUntilTen.get(5);
        System.out.println("Fifth number: " + num);

        int removeNum = numbersUntilTen.remove(2);
        System.out.println("Number '2' removed:");
        System.out.println(numbersUntilTen);

    }
}
