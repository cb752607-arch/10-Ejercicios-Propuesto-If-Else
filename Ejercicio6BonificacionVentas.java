import java.util.Scanner;

public class Ejercicio6BonificacionVentas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el total de ventas: ");
        double ventas = entrada.nextDouble();
        
        double bonificacion;
        
        if (ventas > 5000) {
            bonificacion = ventas * 0.10;
        } else {
            bonificacion = ventas * 0.05;
        }
        
        double total = ventas + bonificacion;
        
        System.out.println("Bonificación: S/" + bonificacion);
        System.out.println("Total (Ventas + Bonificación): S/" + total);
    }
}
