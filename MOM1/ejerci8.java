import java.util.Scanner;

public class ejerci8 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
    //Definir tipo de variable y inicializarla en cero
        int año = 0;
    //Solicitar al usuario que ingrese un año
        System.out.println("Ingresa el año");
        año = sc.nextInt();
    //Validar las condicion de que año sea devisible entre 4 pero no entre 100 
     if (año % 4 == 0 && año % 100 !=0){
        System.out.println(año + " es un año bisiesto");
    //Si la condicion anterior no se cumple validar que el año sea divisible entre 400
     }else if (año % 400 == 0){
        System.out.println(año + " es un año bisiesto");
     }else {
        System.out.println(año + " no es un año bisiesto");
     }
    }
    
}
