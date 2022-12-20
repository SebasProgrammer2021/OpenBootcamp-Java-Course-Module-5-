package errorHandling;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introducre dos numeros separados por un espacio:");

        int numero1 = reader.nextInt();
        int numero2 = reader.nextInt();

        try {
            int result = numero1 / numero2;
            System.out.println("El resultado es = " + result);
//            capturar todas las exceptions
//        } catch (Exception exception) {
//            capturar las exceptions aritmeticas
        } catch (ArithmeticException exception) {
            System.out.println("oh oh exception, = " + exception.getClass());
        } catch (Exception exception) {
//            se puedne capturar multiples exceptions
            System.out.println("Cualquier otra excepción");
        } finally {
//            se aplica siempre el finaly pase lo que pase, para cerrar cosas pendinetes
            // no es recomendado utilizarlo
            System.out.println("finaly");
        }

    }
}
