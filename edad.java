import java.util.Scanner;
public class edad {
    public static void main(String[] args) {
        int edad = 0;
        int mayedad = 0;
        int menedad = 0;
        Scanner sc = new Scanner(System.in);
        while (edad >= 0) {
            System.out.println("Ingresa la edad:");
            edad = sc.nextInt();
            if (edad > 0){
                if (edad > 18){
                    mayedad ++;
                }else {
                    menedad ++;
                }

            }else{
                System.out.println("Programa terminado");
            }
   
        }
        System.out.println(mayedad + " personas son mayores de edad y " + menedad + " personas son menores de edad");

    }
}
