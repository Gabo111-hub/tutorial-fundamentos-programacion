import java.util.ArrayList;

public class EjemploListas {
    public static void main(String[] args) {
        // Declaración de una lista dinámica de tipo String
        ArrayList<String> inventario = new ArrayList<>();

        System.out.println("--- Inventario de Ropa 'Terrícolas' ---");

        // Agregando elementos a la lista con .add()
        inventario.add("Camiseta Oversize Alien 4 Ojos (Negra)");
        inventario.add("Hoodie Estilo Doodle (Gris)");
        inventario.add("Poncho Moderno Shuar (Verde Oscuro)");

        System.out.println("Prendas iniciales registradas: " + inventario.size());
        mostrarLista(inventario);

        // Simulamos que se agota una prenda y la eliminamos usando .remove()
        System.out.println("\n[Alerta] Se ha agotado el 'Hoodie Estilo Doodle (Gris)'. Actualizando inventario...");
        inventario.remove(1); // El hoodie estaba en la posición 1 (recordando que se cuenta desde 0)

        // Mostramos el inventario actualizado
        System.out.println("\nInventario actualizado:");
        mostrarLista(inventario);
    }

    // Método auxiliar para recorrer y mostrar la lista
    public static void mostrarLista(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
    }
}
