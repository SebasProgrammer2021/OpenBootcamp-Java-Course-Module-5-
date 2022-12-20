package errorHandling;

public class GenerarExcepciones {
    public static void main(String[] args) {
        double result = dividir(4, 0);
    }

    public static double dividir(double number1, double number2) throws ArithmeticException {
        double result;

        try {
            result = number1 / number2;
        } catch (ArithmeticException exception) {
            throw new ArithmeticException();
        }

        return result;
    }
}
