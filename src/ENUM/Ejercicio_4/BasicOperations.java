package ENUM.Ejercicio_4;

public enum BasicOperations {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    double calculate(double x, double y) {
        switch (this) {
            case ADD:
                return x + y;
            case SUBTRACT:
                return x - y;
            case MULTIPLY:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operation found:" + this);
        }
    }
}
