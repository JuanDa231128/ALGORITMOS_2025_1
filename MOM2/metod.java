import java.util.Scanner;

public class metod {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    // Método que muestra el menú y llama a los métodos correspondientes
    public static void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n--- CALCULADORA DE AREAS ---");
            System.out.println("1. CUADRADO");
            System.out.println("2. REGTANGULO");
            System.out.println("3. TRIANGULO");
            System.out.println("4. CIRCULO");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cuadrado();
                    break;
                case 2:
                    regtangulo();
                    break;
                case 3:
                    triangulo();
                    break;
                case 4:
                    circulo();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    // Métodos sin parámetros ni retorno
    public static void cuadrado() {
        int a = pedirNumero("Ingrese la base: ");
        int b = pedirNumero("Ingrese la altura: ");
        int resultado = a * b;
        System.out.println("El area del cuadrado es: " + resultado);
    }

    public static void regtangulo() {
        int a = pedirNumero("Ingrese la base: ");
        int b = pedirNumero("Ingrese la altura: ");
        int resultado = a * b;
        System.out.println("El area del regtangulo es: " + resultado);
    }

    public static void triangulo() {
        int a = pedirNumero("Ingrese la base: ");
        int b = pedirNumero("Ingrese la altura: ");
        int resultado = (a * b) / 2;
        System.out.println("El area del triangulo es " + resultado);
    }

    public static void circulo() {
        int a = pedirNumero("Ingrese el radio : ");
        double b = 3.14;
        double resultado = b * (a*a);
        System.out.println("El del circulo es " + resultado);
    }

    // Método auxiliar para pedir números (no cambia el objetivo porque no recibe ni retorna desde los métodos de operación)
    public static int pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }
}