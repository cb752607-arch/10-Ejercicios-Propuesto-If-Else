import java.util.Scanner;

public class Ejercicio4ConsumoElectrico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese los kWh consumidos: ");
        double kwh = entrada.nextDouble();
        double montoPagar;
        
        if (kwh <= 100) {
            montoPagar = kwh * 0.80;
        } else {
            montoPagar = (100 * 0.80) + ((kwh - 100) * 1.20);
        }
        
        System.out.println("El monto a pagar es: S/" + montoPagar);
    }
}
