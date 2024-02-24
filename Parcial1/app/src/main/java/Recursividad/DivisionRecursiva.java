package Recursividad;

public class DivisionRecursiva {
    public static void main(String[] args) {
        int numero = 16;
        int divisor = 2;

        int resultado = dividirRecursivo(numero, divisor);
        System.out.println("16/2=8");
        System.out.println("8/2=4");
        System.out.println("4/2=2");
        System.out.println("2/2=1");
        System.out.println("El resultado de la división es: " + resultado);
    }

    public static int dividirRecursivo(int numero, int divisor) {
        if (numero == 1) {
            return 1;
        } else {
            return dividirRecursivo(numero / divisor, divisor);
        }
    }
}
