package poo.ejercicioHerencia;

/**
 * @name SmartDevice
 * @description clase general abstract de un dispositivo inteligente
 * @version 1.0
 * @author Sebastián Londoño
 */
public class SmartDevice {
    int anioFabricacion;
    int capacidadBateria;
    String fabricante;
    String modelo;
    String sistemaOpertativo;
    double tamanioPantalla;

    /**
     * Builder no params
     */
    public SmartDevice() {
    };

    /**
     * @name Builder with params
     * @description constructor con parametros de la clase
     * @param anioFabricacion string
     * @param capacidadBateria int
     * @param fabricante string
     * @param modelo string
     * @param sistemaOpertativo string
     * @param tamanioPantalla double
     */
    public SmartDevice(int anioFabricacion, int capacidadBateria, String fabricante, String modelo, String sistemaOpertativo, double tamanioPantalla) {
        this.anioFabricacion = anioFabricacion;
        this.capacidadBateria = capacidadBateria;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.sistemaOpertativo = sistemaOpertativo;
        this.tamanioPantalla = tamanioPantalla;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "anioFabricacion=" + anioFabricacion +
                ", capacidadBateria=" + capacidadBateria +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOpertativo='" + sistemaOpertativo + '\'' +
                ", tamanioPantalla=" + tamanioPantalla +
                '}';
    }
}
