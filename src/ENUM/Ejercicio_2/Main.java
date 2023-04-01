package ENUM.Ejercicio_2;
import ENUM.Ejercicio_2.Flavors;

public class Main {
        Flavors flavors;

        public Main(Flavors flavors) {
            this.flavors = flavors;
        }
        public void FlavorsTaste(){
            switch (flavors){
                case Strawberry:
                    System.out.println("Strawberry tastes good");
                    break;
                case Lemon:
                    System.out.println(Flavors.Lemon + " is delicious!");
                    break;
                case Apple:
                    System.out.println("I Ran out of stuff to say.");
                    break;
                case Mango:
                    System.out.println("Could be better");
                    break;
            }
        }

        public static void main(String[] args) {
            Main t1 = new Main(Flavors.Lemon);
            t1.FlavorsTaste();
        }
}