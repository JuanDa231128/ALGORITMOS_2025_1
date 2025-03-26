import java.util.Scanner;
public class calcu {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    int num1 = 0;
    int num2 = 1;
    int digi1 = 0;
    int conta = 1;

    System.out.println("Ingrese la cantidad de digitos a generar");
    digi1 = scanner.nextInt();
    while (conta <= digi1) {
        System.out.println(num1);
        int suma = num1+num2;
        num1=num2;
        num2=suma;
        conta++;


    }

    }
}
