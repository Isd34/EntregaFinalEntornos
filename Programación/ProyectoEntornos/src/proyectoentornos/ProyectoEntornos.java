package proyectoentornos;

/**
 * Clase principal que ejecuta pruebas sobre los teléfonos Pijiphone y Android.
 * Recrea las funcionalidades de carga, llamadas, linterna y GPS.
 * 
 * <a href="https://view.genially.com/625efe3c84255d001146c045">Control de versiones, optimización y documentación</a>.
 *
 * @author sdiva
 * @version 1.0
 * @link
 * 
 * 
 */
public class ProyectoEntornos {

    public static void main(String[] args) {

        // ====== 1. INSTANCIACIÓN DE OBJETOS ======
        // Se crean los teléfonos y las linternas asociadas
        Pijiphone piji1 = new Pijiphone("Negro", "Pijiphone");
        Linterna linternaPijiphone = new Linterna();
        Android and1 = new Android("Verde");
        Linterna linternaAndroid = new Linterna();

        // ====== 2. PRUEBAS CON EL PIJIPHONE ======
        // Se realizan pruebas de carga, llamadas, linterna y GPS en el Pijiphone
        System.out.println(piji1); //Muestra los datos del Pijiphone
        System.out.println("=== Pruebas Pijiphone ===\n");

        piji1.cargar(); // Se carga antes de cualquier acción
        System.out.println("Batería después de cargar: " + piji1.getBateria());

        piji1.llamar(); // Realiza una llamada
        System.out.println("Batería después de llamar: " + piji1.getBateria());

        piji1.cargar(); // Se vuelve a cargar (No sobrepasa el 100)
        System.out.println("Batería después de cargar: " + piji1.getBateria());

        piji1.setLinternita(linternaPijiphone); // Se settea linterna
        piji1.encenderLinterna(); // Enciende linterna
        piji1.apagarLinterna(); // Apaga linterna

        System.out.println("Ubicación inicial GPS: " + piji1.getUbicacion());
        piji1.actualizarUbicacion("Madrid"); //Actualiza la ubicación
        System.out.println("Ubicación actualizada GPS: " + piji1.getUbicacion());

        // ====== 3. PRUEBAS CON EL ANDROID ======
        // Se realizan en el Android, empezando sin batería
        System.out.println("\n=== Pruebas &-roid ===\n");
        System.out.println(and1); // Muestra los datos del &-droid

        and1.llamar(); // Prueba llamada sin batería

        and1.encenderLinterna(); // Intenta encender la linterna sin estar asociada

        and1.cargar(); // Se carga después
        System.out.println("Batería después de cargar: " + and1.getBateria());

        and1.setLinternita(linternaAndroid); // Se settea la linterna
        and1.encenderLinterna(); // Enciende linterna
        and1.apagarLinterna(); // Apaga linterna

        and1.llamar(); // Llama después de cargar

        // ====== 4. DATOS GENERALES ======
        // Se muestra el total de llamadas realizadas por todos los teléfonos
        System.out.println("\n=== Generales ===");
        System.out.println("Llamadas totales de la empresa: " + Telefono.getLlamadasTotales());
    }
}
