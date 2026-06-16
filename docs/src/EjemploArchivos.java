import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "reporte_ventas.txt";

        System.out.println("--- Generador de Reportes ---");

        // Bloque try-catch para manejar posibles errores de entrada/salida (I/O)
        try {
            // FileWriter crea el archivo. PrintWriter nos facilita escribir líneas enteras.
            FileWriter archivo = new FileWriter(nombreArchivo);
            PrintWriter escritor = new PrintWriter(archivo);

            // Escribimos el contenido en el archivo
            escritor.println("REPORTE DE VENTAS DEL DÍA");
            escritor.println("-------------------------");
            escritor.println("1. Camiseta Oversize Alien 4 Ojos - Vendidas: 15");
            escritor.println("2. Poncho Moderno Shuar - Vendidas: 8");
            escritor.println("-------------------------");
            escritor.println("Total de artículos vendidos: 23");

            // Siempre se debe cerrar el flujo de escritura al terminar
            escritor.close();

            System.out.println("¡Éxito! El archivo '" + nombreArchivo + "' se ha creado correctamente en el directorio raíz.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al intentar escribir el archivo.");
            e.printStackTrace(); // Muestra los detalles técnicos del error en consola
        }
    }
}
