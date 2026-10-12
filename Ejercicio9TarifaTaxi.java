import java.util.Scanner;

public class Ejercicio9TarifaTaxi {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese los kilómetros recorridos: ");
        double km = entrada.nextDouble();
        
        double total;
        
        if (km <= 3) {
            total = 8.0;
        } else {
            total = 8.0 + ((km - 3) * 2.50);
        }
        
        System.out.println("La tarifa de taxi es: S/" + total);
    }
}
