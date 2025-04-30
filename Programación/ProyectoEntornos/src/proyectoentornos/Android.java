package proyectoentornos;

/**
 * Clase Android, un tipo de teléfono concreto. Incorpora la funcionalidad de
 * abrir Paint.
 *
 * Extiende la clase {@link Telefono}.
 *
 * @author sdiva
 * @version 1.0
 * @see Telefono
 */
public class Android extends Telefono {

    /**
     * Clase sin atributos adicionales propios, hereda todos los atributos de la
     * clase Telefono.
     */
    /**
     * Constructor de la clase Android.
     *
     * @param colorIn color del teléfono
     */
    public Android(String colorIn) {
        super(colorIn, 200, "&-roid");
    }

    /**
     * Método que abre la aplicación Paint. Solo funciona en Windows.
     */
    public void pintar() {
        try {
            ProcessBuilder proceso = new ProcessBuilder("mspaint.exe");
            proceso.start();
        } catch (Exception e) {
            System.out.println("No se pudo abrir Paint.");
        }
    }

    /**
     * Método que carga la batería del Android. Suma un tercio de la batería
     * actual más 20 sin superar el 100%.
     */
    @Override
    public void cargar() {
        if (getBateria() < 100) {
            System.out.println("**Cargando " + getMarca() + "***");
            esperar(2);
            setBateria(getBateria() + (getBateria() * 1 / 3) + 20);
            if (getBateria() > 100) {
                setBateria(100);
            }
        } else {
            System.out.println("La batería está al máximo");
        }
    }

    /**
     * Método toString que devuelve la información del Android.
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
