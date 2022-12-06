package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {

    /*el modificador static indica que el metodo pertenece a la clase y no necesito crear una instancia para
    poder utilizarlo*/
    public static void main(String[] args) {
//        creacion de objetos

//        Obj con constructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        Motor motorGTI = new Motor(190, 459.0, 6, "GTI");
//        Obj con constructor con params
        Vehiculo fordMondeo = new Vehiculo(2010, 2.1, false, "Ford", "Mondeo", motorGTI, 0);
        System.out.println("fordMondeo = " + fordMondeo.fabricante);
        System.out.println("fordMondeo = " + fordMondeo.anio);
        fordMondeo.acelerar(40);
        System.out.println("fordMondeo = " + fordMondeo.velocidad);

//        herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";

        System.out.println("fin programa");


//        polimorfismo
//        a partir de una clase se pueden tener varias formas
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

//        abstractas: no permiten ser instanciadas, solo instancian las clases hijas.
    }
}
