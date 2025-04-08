import java.util.Scanner;

public class mayorNumeroVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        int mayor = 0;
        int posicion = 0;

        System.out.println("Ingresa 8 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posicion = i;
            }
        }
        
        System.out.println("El número mayor es: " + mayor);
        System.out.println("Se encuentra en la posición: " + (posicion + 1));

        scanner.close();
    }
}