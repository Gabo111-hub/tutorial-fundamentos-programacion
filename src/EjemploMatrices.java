public class EjemploMatrices {
    public static void main(String[] args) {
        // Simulamos una imagen de 3x3 píxeles en escala de grises
        int[][] pixeles = {
            {120, 45,  200},
            {10,  250, 80},
            {90,  150, 30}
        };

        int pixelMasBrillante = pixeles[0][0];
        int filaBrillante = 0;
        int colBrillante = 0;

        System.out.println("--- Analizando Matriz de Píxeles ---");

        // Recorremos la matriz con dos ciclos for anidados
        for (int i = 0; i < pixeles.length; i++) { // Recorre las filas
            for (int j = 0; j < pixeles[i].length; j++) { // Recorre las columnas
                System.out.print(pixeles[i][j] + "\t");
                
                // Si encontramos un píxel más brillante, lo guardamos
                if (pixeles[i][j] > pixelMasBrillante) {
                    pixelMasBrillante = pixeles[i][j];
                    filaBrillante = i;
                    colBrillante = j;
                }
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }

        System.out.println("\nResultado del análisis:");
        System.out.println("El píxel más brillante tiene una intensidad de " + pixelMasBrillante);
        System.out.println("Se encuentra en la fila " + filaBrillante + ", columna " + colBrillante);
    }
}
