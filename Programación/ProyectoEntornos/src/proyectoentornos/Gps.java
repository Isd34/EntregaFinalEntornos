package proyectoentornos;

/**
 * Clase GPS de un teléfono. Permite almacenar y actualizar la ubicación.
 *
 * @author sdiva
 * @version 1.0
 */
public class Gps {

    /**
     * Atributo que almacena la ubicación actual del GPS en formato String.
     */
    private String ubicacion;

    /**
     * Constructor de la clase Gps.
     *
     * @param ubicacionIn ubicación inicial del GPS
     */
    public Gps(String ubicacionIn) {
        this.ubicacion = ubicacionIn;
    }

    /**
     * Método que actualiza la ubicación del GPS.
     *
     * @param ubicacion nueva ubicación a establecer
     */
    public void actualizarUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Método que devuelve la ubicación actual del GPS.
     *
     * @return ubicación actual en formato String
     */
    public String getUbicacion() {
        return ubicacion;
    }
}
