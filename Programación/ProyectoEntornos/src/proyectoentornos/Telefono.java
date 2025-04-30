package proyectoentornos;

/**
 * Clase abstracta de teléfono. Define atributos y métodos comunes para los
 * teléfonos.
 *
 * @author sdiva
 * @version 1.0
 */
public abstract class Telefono {

    /**
     * Código PUK único del teléfono (8 dígitos).
     */
    private final String PUK;

    /**
     * Precio del teléfono.
     */
    private double precio;

    /**
     * Color del teléfono.
     */
    private String color;

    /**
     * Nivel de batería del teléfono (0 a 100).
     */
    private int bateria;

    /**
     * Marca del teléfono.
     */
    private String marca;

    /**
     * Número de llamadas realizadas por un teléfono.
     */
    private int llamadas;

    /**
     * Contador total de llamadas realizadas por todos los teléfonos (atributo
     * estático).
     */
    private static int llamadasTotales;

    /**
     * Atributo de tipo linterna (Agregación), que permite utilizar una
     * linterna.
     */
    private Linterna linternita;

    /**
     * Constructor de la clase Telefono.
     *
     * @param colorIn color del teléfono
     * @param precioIn precio del teléfono
     * @param marcaIn marca del teléfono
     */
    public Telefono(String colorIn, double precioIn, String marcaIn) {
        this.color = colorIn;
        this.PUK = "" + (int) (Math.floor(Math.random() * 100000000));
        this.precio = precioIn;
        this.marca = marcaIn;
        this.llamadas = 0;
    }

    /**
     * Método que permite realizar una llamada si hay batería. Resta 5 de
     * batería después de una llamada.
     */
    public void llamar() {
        if (bateria > 0) {
            System.out.println("\n*** LLAMADA ***");
            System.out.println("PIIIIIII PIIIIII");
            this.esperar(4);
            System.out.println("---Conversación privada---");
            this.esperar(5);
            System.out.println("pi pi pi pi pi pi ...");
            System.out.println("*** FIN LLAMADA***\n");
            this.setLlamadas(this.getLlamadas() + 1);
            Telefono.setLlamadasTotales(Telefono.getLlamadasTotales() + 1);
            setBateria(getBateria() - 5);
        } else {
            System.err.println("Batería insuficiente para realizar llamadas.");
        }
    }

    /**
     * Método abstracto para cargar la batería del teléfono.
     */
    public abstract void cargar();

    /**
     * Método para esperar un número determinado de segundos.
     *
     * @param segundos cantidad de segundos a esperar
     */
    void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 3000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Método que enciende la linterna si hay batería suficiente. Resta 5 a la
     * batería.
     */
    public void encenderLinterna() {
        if (linternita == null) {
            System.err.println("Este teléfono no tiene linterna conectada.");
        } else if (bateria >= 5) {
            linternita.encender();
            bateria -= 5;
        } else {
            System.err.println("Batería insuficiente para encender la linterna.");
        }
    }

    /**
     * Método que apaga la linterna si está encendida.
     */
    public void apagarLinterna() {
        if (linternita == null) {
            System.out.println("Este teléfono no tiene linterna conectada.");
        } else if (linternita.isEncendido()) {
            linternita.apagar();
        } else {
            System.out.println("La linterna ya está apagada.");
        }
    }

    // GETTERS
    public static int getLlamadasTotales() {
        return llamadasTotales;
    }

    public Linterna getLinternita() {
        return linternita;
    }

    public String getMarca() {
        return marca;
    }

    public int getLlamadas() {
        return llamadas;
    }

    public String getPuk() {
        return PUK;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public int getBateria() {
        return bateria;
    }

    //SETTERS
    public static void setLlamadasTotales(int llamadasTotales) {
        Telefono.llamadasTotales = llamadasTotales;
    }

    public void setLinternita(Linterna linternita) {
        this.linternita = linternita;
    }

    public void setLlamadas(int llamadas) {
        this.llamadas = llamadas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}
