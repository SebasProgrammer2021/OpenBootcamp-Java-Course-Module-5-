package poo.ejercicioHerencia;

public class Main {
    public static void main(String[] args) {
        // Ejercicio modulo poo
        System.out.println("Ejercicio poo: ");

        SmartDevice deviceTest = new SmartDevice(2022, 5000, "LG", "AUN90", "LG-OS", 50);
        SmartPhone android1 = new SmartPhone(2016, 3000, "Smsung", "A31", "Android", 6.4, 2, 20, "Claro", "C");
        SmartWatch xiaomiIP68 = new SmartWatch(2022, 2000, "Apple", "Serie 7", "iOS", 41, false, "negra", 18);

        System.out.println("deviceTest = " + deviceTest);
        System.out.println("android1 = " + android1);
        System.out.println("xiaomiIP68 = " + xiaomiIP68);
    }
}
