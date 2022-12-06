package poo.ejercicioHerencia;

/**
 * @name SmartDevice
 * @description clase que representa el telefono inteligente
 * @version 1.0
 * @author Sebastián Londoño
 */
public class SmartPhone extends SmartDevice{
    int cantidadPuertosSimCard;
    int megapixelesCamara;
    String operador;
    String tipoPuertoCarga;

    /**
     * @description Builder no params
     */
    public SmartPhone(){};

    /**
     * @param anioFabricacion   string
     * @param capacidadBateria  int
     * @param fabricante        string
     * @param modelo            string
     * @param sistemaOpertativo string
     * @param tamanioPantalla   double
     * @description builder con parametros
     */
    public SmartPhone(int anioFabricacion, int capacidadBateria, String fabricante, String modelo, String sistemaOpertativo, double tamanioPantalla, int cantidadPuertosSimCard, int megapixelesCamara, String operador, String tipoPuertoCarga) {
        super(anioFabricacion, capacidadBateria, fabricante, modelo, sistemaOpertativo, tamanioPantalla);
        this.cantidadPuertosSimCard = cantidadPuertosSimCard;
        this.megapixelesCamara = megapixelesCamara;
        this.operador = operador;
        this.tipoPuertoCarga = tipoPuertoCarga;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "cantidadPuertosSimCard=" + cantidadPuertosSimCard +
                ", megapixelesCamara=" + megapixelesCamara +
                ", operador='" + operador + '\'' +
                ", tipoPuertoCarga='" + tipoPuertoCarga + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", capacidadBateria=" + capacidadBateria +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOpertativo='" + sistemaOpertativo + '\'' +
                ", tamanioPantalla=" + tamanioPantalla +
                '}';
    }
}
