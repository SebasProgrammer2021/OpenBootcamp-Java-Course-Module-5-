package EntradaSalida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Sebastián Londoño Valencia"
 * clase que ejemplifica la lectura de archivos.
 */
public class Main {
    public static void main(String[] args) {
        try {

//        para leer una archivo
            InputStream file = new FileInputStream("C:\\carpeta-prueba-curso-java\\numero1.txt");

            try {
                /*
                fileinputstream devuelve una secuencia de bytes,
                la secuencia de bytes, son array de bytes.
                en fileData se guarda el contenido del archivo, se debe convertir lso bytes a character
                para poder entender y leer bien el conteido del archivo.
                 */
//                esta es la forma mas novedosa para leer el contenido del archivo, meter el contenido del archivo
//                en memoria
                //se utiliza para archivos pequeños, es mas rápido
//                byte[] fileData = file.readAllBytes();
//                for (byte data : fileData) {
////                    System.out.println("data = " + data);
//                    System.out.print((char) data);
//
//                }

//                forma 2 para leer la carpeta
                //se utiliza para carpetas grandes, es mas lento
//                int fileData = file.read();
                    /*
                    el -1 se produce cuando se haya leido el archivo por completo
                    por lo cual debe estar dentro de un ciclo para que lea el contenido
                    del archivo.  el numero fimal es el "EOF" end of file.
                     */
//                while (fileData != -1) {
//                    //la data que se imprime es un int y se debe convertir a character
//                    System.out.print((char)fileData);
//
////                    se debe actualizar los datos en cada iteración del buclo
//                    fileData = file.read();
//                }

                /*
                FORMA 3 LEER DE PARTES EN PARTES
                 */
                byte fileDataArray[] = new byte[5];
                int fileData = file.read(fileDataArray);
                while (fileData != -1) {
                    System.out.print((char)fileData);
                    fileData = file.read();
                }

            } catch (IOException exception) {
                System.out.println("Problema al leer el archivo: " + exception.getMessage());

            }
        } catch (FileNotFoundException exception) {
            System.out.println("error al obtener el archivo: " + exception.getMessage());
        }
    }
}
