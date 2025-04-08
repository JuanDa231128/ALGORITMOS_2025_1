import java.util.Scanner;
public class ejerci10 {
    public static void main(String[] args) {
        //Determinar tipo de variable y iniciarlizarla en cero
        Scanner sc = new Scanner (System.in); 
        double promedio = 0;
        double asistencia = 0;
        //Solicitar al usuario ingresar los datos y guardarlos en la variable
        System.out.println("Ingrese su promedio (Separado por comas Ej. 8,0)");
        promedio = sc.nextDouble();
        System.out.println("Ingrese su porcentaje de asistencia");
        asistencia = sc.nextInt();
        // Validar las condiciones para ver si aplica o no a la beca 
        if (promedio >= 8.5 && asistencia >= 90){
            System.out.println("Calificas para la beca");
        }else {
            System.out.println("No calificas para beca");
        }


    }
}
