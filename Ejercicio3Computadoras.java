import java.util.Scanner;

public class Ejercicio3Computadoras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de computadoras a comprar: ");
        int cantidad = entrada.nextInt();
        
        double precioUnitario = 2500.0;
        double subtotal = cantidad * precioUnitario;
        double descuento;
        
        if (cantidad >= 5) {
            descuento = subtotal * 0.12;
        } else {
            descuento = subtotal * 0.05;
        }
        
        double total = subtotal - descuento;
        
        System.out.println("Importe (Subtotal): S/" + subtotal);
        System.out.println("Descuento: S/" + descuento);
        System.out.println("Total a pagar: S/" + total);
    }
}
