package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {

    boolean baul;

    public Motocicleta() {
    }

    public Motocicleta(int anio, double centimetrosCubicos, boolean esDeportivo, String fabricante, String modelo, Motor motor, int velocidad, boolean baul) {
        super(anio, centimetrosCubicos, esDeportivo, fabricante, modelo, motor, velocidad);
        this.baul = baul;
    }
}
