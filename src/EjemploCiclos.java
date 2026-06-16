import java.util.Scanner;

public class EjemploCiclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasenaCorrecta = "Terricolas2026"; 
        String intento = "";
        int intentosRealizados = 0;
        int maxIntentos = 3;

        System.out.println("--- Sistema de Login ---");

        // El ciclo while se repite mientras la contraseña sea incorrecta 
        // y no se haya superado el límite de intentos permitidos.
        while (!intento.equals(contrasenaCorrecta) && intentosRealizados < maxIntentos) {
            System.out.print("Ingrese su contraseña: ");
            intento = scanner.nextLine();
            intentosRealizados++;

            if (intento.equals(contrasenaCorrecta)) {
                System.out.println("¡Acceso concedido! Bienvenido al sistema.");
            } else {
                System.out.println("Contraseña incorrecta. Intentos restantes: " + (maxIntentos - intentosRealizados));
            }
        }

        // Si el ciclo termina y la contraseña sigue siendo incorrecta, se bloquea.
        if (!intento.equals(contrasenaCorrecta)) {
            System.out.println("Cuenta bloqueada por seguridad. Ha superado los 3 intentos.");
        }
        
        scanner.close();
    }
}
