public class EjemploMetodos {

    // Método 1: Calcula la Fuerza (F = m * a)
    public static double calcularFuerza(double masa, double aceleracion) {
        return masa * aceleracion;
    }

    // Método 2: Calcula la Velocidad Final (Vf = Vo + a * t)
    public static double calcularVelocidadFinal(double velInicial, double aceleracion, double tiempo) {
        return velInicial + (aceleracion * tiempo);
    }

    public static void main(String[] args) {
        System.out.println("--- Módulo de Cálculos Físicos ---");
        
        // Llamada al método de Fuerza
        double m = 15.5; 
        double a = 9.8; 
        double fuerzaResultante = calcularFuerza(m, a);
        System.out.println("La fuerza aplicada a una masa de " + m + " kg con aceleración de " + a + " m/s² es: " + fuerzaResultante + " N");
        
        // Llamada al método de Velocidad Final
        double vo = 0; 
        double t = 5; 
        double velocidadFinal = calcularVelocidadFinal(vo, a, t);
        System.out.println("La velocidad final tras " + t + " segundos es: " + velocidadFinal + " m/s");
    }
}
