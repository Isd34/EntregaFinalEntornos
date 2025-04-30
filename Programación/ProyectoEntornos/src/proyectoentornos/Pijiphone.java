package proyectoentornos;

/**
 * Clase que los Pijiphone, un tipo de teléfono concreto. Incorpora
 * funcionalidad de GPS.
 *
 * Extiende la clase {@link Telefono}.
 *
 * @author sdiva
 * @version 1.0
 * @see Telefono
 */
public class Pijiphone extends Telefono {

    /**
     * Objeto GPS asociado al Pijiphone (Composición), que permite gestionar la
     * ubicación.
     */
    private Gps gpsConcreto;

    /**
     * Constructor de la clase Pijiphone.
     *
     * @param colorIn color del teléfono
     * @param marcaIn marca del teléfono
     */
    public Pijiphone(String colorIn, String marcaIn) {
        super(colorIn, 700, marcaIn);
        this.gpsConcreto = new Gps("Segovia");
    }

    /**
     * Método que realiza una llamada y muestra un mensaje adicional de
     * grabación.
     */
    @Override
    public void llamar() {
        System.out.println("Esta llamada va a ser grabada");
        super.llamar();
    }

    /**
     * Método que carga la batería del Pijiphone. Suma 70 de batería sin superar
     * el 100%.
     */
    @Override
    public void cargar() {
        if (getBateria() < 100) {
            System.out.println("**Cargando " + getMarca() + "**");
            esperar(2);
            setBateria(getBateria() + 70);
            if (getBateria() > 100) {
                setBateria(100);
            }
        } else {
            System.out.println("La batería está al máximo");
        }
    }

    /**
     * Método para actualizar la ubicación del GPS.
     *
     * @param ubicacion nueva ubicación a establecer
     */
    public void actualizarUbicacion(String ubicacion) {
        gpsConcreto.actualizarUbicacion(ubicacion);
    }

    /**
     * Método que obtiene la ubicación actual del GPS.
     *
     * @return ubicación actual
     */
    public String getUbicacion() {
        return gpsConcreto.getUbicacion();
    }

    /**
     * Método toString que devuelve la información del Pijiphone.
     *
     * @return información del teléfono en formato String
     */
    @Override
    public String toString() {
        return "Marca: " + getMarca() + "\n"
                + "PUK: " + getPuk() + "\n"
                + "Color: " + getColor() + "\n"
                + "Precio: " + getPrecio() + "\n"
                + "Batería: " + getBateria() + "\n";
    }
}
