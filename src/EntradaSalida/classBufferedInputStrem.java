package EntradaSalida;

import java.io.*;
import java.util.Scanner;

public class classBufferedInputStrem {
    public static void main(String[] args) {
        try {
//        para leer una archivo
            InputStream file = new FileInputStream("C:\\carpeta-prueba-curso-java\\numero1.txt");
            /*
            lee trozos grandes pero nos dara pedazos pequeños, de la memoria, de 5 e 5 o 10 en 10 etc.

             */
            BufferedInputStream bufferFile = new BufferedInputStream(file);

            try {
                int fileData = bufferFile.read();
                while (fileData != -1) {
                    System.out.print((char) fileData);
                    fileData = bufferFile.read();
                }

            } catch (IOException exception) {
                System.out.println("Problema al leer el archivo: " + exception.getMessage());

            }
        } catch (FileNotFoundException exception) {
            System.out.println("error al obtener el archivo: " + exception.getMessage());
        }

    }
}
