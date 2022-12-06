package poo.clases;

public class Vehiculo {
    //    atributos
    protected int velocidad;
    protected int anio;
    protected double centimetrosCubicos;
    protected boolean esDeportivo;
    protected String fabricante;
    protected String modelo;
    protected Motor motor;

    //    constructores
    public Vehiculo() {

    }

    public Vehiculo(int anio, double centimetrosCubicos, boolean esDeportivo, String fabricante, String modelo, Motor motor, int velocidad) {
        this.anio = anio;
        this.centimetrosCubicos = centimetrosCubicos;
        this.esDeportivo = esDeportivo;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.motor = motor;
        this.velocidad = velocidad;
    }

    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    //    metodos
    public void acelerar(int cantidad) {
        this.velocidad += cantidad;
    }

//    getters and setters
//    se encapsulan para no hacer uso indebido de los atts
}
