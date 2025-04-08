import java.util.Scanner;
public class ejerci16 {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        numero2 = sc.nextInt();
        if (numero2 % numero1 == 0){
            System.out.println( numero2 + " es multiplo de "+ numero1);
        }else{ 
            System.out.println(numero2 + " NO es multiplo de "+ numero1);
        }
        
    }
}
