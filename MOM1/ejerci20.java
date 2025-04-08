import java.util.Scanner;
public class ejerci20 {
    public static void main(String[] args) {
      // Determinar los tipos de variables y inicializarlas en cero
      double a = 0;
      double b = 0;
      double c = 0;
      double operacion = 0;
      //Solicitar al usuario el ingreso de los valores
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el valor de a");
      a = sc.nextDouble();
      System.out.println("Ingrese el valor de b");
      b = sc.nextDouble();
      System.out.println("Ingrese el valor de c");
      c = sc.nextDouble();
      //Validar que a - b no sea cero
      if (a != b){
      //Realizar la operacion solicitada
        operacion = (a + b) * c / (a - b);
        System.out.println("EL resultado de la operacion es " + operacion);
      }else {
        System.out.println("No es posible realizar la operacion ya que daria como resultado cero");
      }




    }
}
