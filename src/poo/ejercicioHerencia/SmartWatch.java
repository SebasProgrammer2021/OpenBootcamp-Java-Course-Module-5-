package poo.ejercicioHerencia;

/**
 * @name SmartDevice
 * @description clase que representa el reloj inteligente
 * @version 1.0
 * @author Sebastián Londoño
 */
public class SmartWatch extends SmartDevice{
    boolean tieneCamara;
    String colorPulsera;
    int duracionBateriaHoras;

    /**
     * @description builder no params
     */
    public SmartWatch() {}

    /**
     * @param anioFabricacion   string
     * @param capacidadBateria  int
     * @param fabricante        string
     * @param modelo            string
     * @param sistemaOpertativo string
     * @param tamanioPantalla   double
     * @description constructor con parametros de la clase
     */
    public SmartWatch(int anioFabricacion, int capacidadBateria, String fabricante, String modelo, String sistemaOpertativo, double tamanioPantalla, boolean tieneCamara, String colorPulsera, int duracionBateriaHoras) {
        super(anioFabricacion, capacidadBateria, fabricante, modelo, sistemaOpertativo, tamanioPantalla);
        this.tieneCamara = tieneCamara;
        this.colorPulsera = colorPulsera;
        this.duracionBateriaHoras = duracionBateriaHoras;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tieneCamara=" + tieneCamara +
                ", colorPulsera='" + colorPulsera + '\'' +
                ", duracionBateriaHoras=" + duracionBateriaHoras +
                ", anioFabricacion=" + anioFabricacion +
                ", capacidadBateria=" + capacidadBateria +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOpertativo='" + sistemaOpertativo + '\'' +
                ", tamanioPantalla=" + tamanioPantalla +
                '}';
    }
}
