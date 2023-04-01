package ENUM.Ejercicio_5;

enum Size {
    SMALL, MEDIUM, LARGE,
}

class Test {
    Size coffeSize;
    public Test(Size coffeSize) {
        this.coffeSize = coffeSize;
    }
    public void order() {
        switch(coffeSize) {
            case SMALL:
                System.out.println("I ordered a 7 oz. coffee.");
                break;
            case MEDIUM:
                System.out.println("I ordered a 12 oz. coffee.");
                break;
            case LARGE:
                System.out.println("I ordered a 15 oz. coffee.");
                break;
            default:
                System.out.println("I don't know which one to order.");
                break;
        }
    }
}