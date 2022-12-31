package ejercicioModulos789;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @author Sebastián Londoño Valencia
 */
public class Main {
    public static void main(String[] args) {
        String[] womenNames = {"Sofia", "Lorena", "Lisa", "Kendra", "Valentina"};
        System.out.println("Ejercicio 1");
        for (String name : womenNames) {
            System.out.println("name = " + name);
        }
        System.out.println("\n");

        System.out.println("Ejercicio 2");
        int[][] nuevaMatrix = new int[3][3];
        fillMatrix(nuevaMatrix);

        for (int i = 0; i < nuevaMatrix.length; i++) {
            for (int j = 0; j < nuevaMatrix[i].length; j++) {
                System.out.println("fila: " + i + " - columna: " + j + " - valor de la posición: " + nuevaMatrix[i][j]);
            }
        }
        System.out.println("\n");

        System.out.println("Ejercicio 3");
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("vector = " + vector);
        vector.remove(1);
        vector.remove(1);
        System.out.println("vector = " + vector);
        System.out.println("\n");

        System.out.println("Ejercicio 4");
        System.out.println("Se crearian multiples nuevos vectores " +
                "implicando mayor consumo de memoria.");
        System.out.println("\n");

        System.out.println("Ejercicio 5");
        ArrayList<String> laptopBrands = new ArrayList<>();
        laptopBrands.add("Acer");
        laptopBrands.add("Lenovo");
        laptopBrands.add("Asus");
        laptopBrands.add("Dell");

        LinkedList<String> laptopBrandsCopy = new LinkedList<>(laptopBrands);

        System.out.println("ArrayList");
        for (String brand : laptopBrands) {
            System.out.println("Brand = " + brand);
        }
        System.out.println("\n");

        System.out.println("LinkedList");
        for (String elemento : laptopBrandsCopy) {
            System.out.println("elemento = " + elemento);
        }
        System.out.println("\n");

        System.out.println("Ejercicio 6");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("numbers = " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(numbers.get(i));
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.println("\n");

        System.out.println("Ejercicio 7");
        dividirPorCero(10, 0);
        System.out.println("\n");

        System.out.println("Ejercicio 8");
        try {
            InputStream file = new FileInputStream("src\\ejercicioModulos789\\fileIn.txt");
            PrintStream exitFile = new PrintStream("src\\ejercicioModulos789\\archivoSalida.txt");
            copyFile(file, exitFile);
        } catch (FileNotFoundException exception) {
            System.out.println("Error finding the file: " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("Error reading the file: " + exception.getMessage());
        }
    }

    public static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (j + 1) * 10;
            }
        }
    }

    public static void dividirPorCero(int number1, int numerb2) throws ArithmeticException {
        try {
            System.out.println(number1 / numerb2);
        } catch (ArithmeticException exception) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    public static void copyFile(InputStream fileIn, PrintStream fileOut) throws IOException {
        try {
            byte[] fileData = fileIn.readAllBytes();

            for (byte data : fileData) {
                fileOut.print((char) data);
            }
            fileOut.close();
            System.out.println("Finish successfully");

        } catch (IOException exception) {
            System.out.println("Error reading the file: " + exception.getMessage());
        }


    }
}
