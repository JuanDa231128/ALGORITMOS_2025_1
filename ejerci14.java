import java.util.Scanner;
public class ejerci14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        //Definir tipo de varible y inicializarla en cero
      int precio = 0;
      //Solicitar que se ingrese el valor del producto
       System.out.println("Ingrese el valor del producto"); 
       precio = sc.nextInt();
       //Preguntar si tiene cupon de descuento
        System.out.println("Tienes un cupon de descuento (True/False)");
        boolean tienecupon = sc.nextBoolean();
        double descuento = precio * 75 / 100;
        //Validar si tiene cupon y el valor es mayor a 60 pr aplicar el descuento
        if (precio >= 60 && tienecupon){
        System.out.println("El valor de su compra con descuento es " + descuento);
        // Si no se cummplen las dos condiciones imprimir el valor del producto
    }else {
        System.out.println("EL valor de su compra es " + precio);
    }
    }
}
