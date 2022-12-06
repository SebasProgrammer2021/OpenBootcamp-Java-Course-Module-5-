package poo.clases;

public class Motor {
    int caballos;
    String modelo;
    int numeroCilindros;
    double torque;

    public Motor() {
    }

    public Motor(int caballos, double torque, int numeroCilindros, String modelo) {
        this.caballos = caballos;
        this.torque = torque;
        this.numeroCilindros = numeroCilindros;
        this.modelo = modelo;
    }
}
