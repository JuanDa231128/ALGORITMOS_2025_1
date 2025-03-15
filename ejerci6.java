import java.util.Scanner;
 
public class ejerci6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    // Definir el tiplo de variable y inicializarla en cero
     int  nota1 = 0 ;
     //Solicitar al usuario ingresar un numero
      System.out.println("Ingrese la calificacion obtenida");
      nota1 = sc.nextInt();
      // Validar que el valor ingresado este entre 0 y 10
      if (nota1 > 10) {
        System.out.println("El valor ingresado debe ser entre 0 y 10");
      }else if (nota1 < 0) {
        System.out.println("El valor ingresado debe ser entre 0 y 10");
    // Definir las condiciones para saber si aprueba o no examen (La nota debe ser mayor o igual a 6)
    }else if (nota1 >= 6) {
        System.out.println("Felicitiaciones aprobaste el examen");
    }else {
        System.out.println("Reprobaste el examen");
    }
    }
}
 
 