import java.util.Scanner;
public class ejerci4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Definir el tiplo de variable y inicializarla en cero
        int numero1 = 0;
        // Solicitar al usuario que ingrese un numero
        System.out.println("Ingrese un numero");
        numero1 = sc.nextInt();
        // Determinar si el numero es par o impar de acuerdo a la operacion modulo y imprimir un mensaje en cada caso
        if (numero1 %2 == 0){
            System.out.println( numero1 + " es un numero par");
        }else {
            System.out.println(numero1 + " es un numero impar");
        }
 
       
    }
}
 
