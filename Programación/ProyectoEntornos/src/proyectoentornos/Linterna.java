package proyectoentornos;

/**
 * Clase linterna (Accesorio externo a un teléfono). Permite
 * encender y apagar la linterna.
 *
 * @author sdiva
 * @version 1.0
 */
public class Linterna {

    /**
     * Atributo que indica si la linterna está encendida (true) o apagada
     * (false).
     */
    private boolean encendido;

    /**
     * Constructor de la clase Linterna. Inicializa la linterna apagada.
     */
    public Linterna() {
        this.encendido = false;
    }

    /**
     * Método que enciende la linterna. Muestra un mensaje en consola.
     */
    public void encender() {
        System.out.println("**Linterna ENCENDIDA**");
        this.setEncendido(true);
    }

    /**
     * Método que apaga la linterna. Muestra un mensaje en consola.
     */
    public void apagar() {
        System.out.println("**Linterna APAGADA**");
        this.setEncendido(false);
    }

    /**
     * Método que devuelve si la linterna está encendida.
     *
     * @return true si está encendida, false si está apagada
     */
    public boolean isEncendido() {
        return encendido;
    }

    /**
     * Método que establece el estado de la linterna.
     *
     * @param encendido estado a establecer (true para encendida, false para
     * apagada)
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
