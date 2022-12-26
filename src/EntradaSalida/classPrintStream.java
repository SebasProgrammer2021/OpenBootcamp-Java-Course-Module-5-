package EntradaSalida;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class classPrintStream {
    public static void main(String[] args) {
        try {
            PrintStream  impresora = new PrintStream("archivoSalida.txt");
            impresora.println("mi primera linea");
            impresora.println("mi segunda linea");
            impresora.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
