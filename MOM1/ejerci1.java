import java.util.Scanner;
 
public class ejerci1 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definir tipos de variables y darles valor de 0
        int numero1 = 0;
        int numero2 = 0;
        // Solicitar al usuario el valor de cada variable
        System.out.println("Ingrese el primer numero");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = sc.nextInt();
        sc.close();
        // Validar que condicion se cumple de acuerdo a los operadores racionales y imprimir un mensaje de acuerdo a esta
        if (numero1 > numero2) {
        System.out.println(numero1 + " es mayor que " + numero2);
        }else if (numero1 == numero2) {
            System.out.println(numero1 + " es igual que " + numero2);
        }else {
            System.out.println(numero1 + " es menor que " + numero2);
        }
       
    }
 
    @Override
    public String toString() {
        return "ejerci1 []";
    }
}
