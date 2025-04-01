import java.util.Scanner;

public class califiEstudi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0;
        int reprobados = 0;
        int calificacion = 0;

        while (calificacion != -1) {
            System.out.print("Ingresa la calificación de cada estudiante (valor entre 0 y 100) o ingrese -1 para finalizar: ");
            calificacion = sc.nextInt();

            if (calificacion >= 0 && calificacion <= 100) {
                if (calificacion >= 60) {
                    aprobados++;
                } else {
                    reprobados++;
                }
            } else {
                System.out.println("Programa finalizado");
            }
        }
        System.out.println("Número de estudiantes aprobados: " + aprobados);
        System.out.println("Número de estudiantes reprobados: " + reprobados);
        sc.close();
    }
}