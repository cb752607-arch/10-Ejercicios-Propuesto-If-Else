import java.util.Scanner;

public class Ejercicio2Prestamo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el sueldo: ");
        double sueldo = entrada.nextDouble();
        
        double prestamoMaximo;
        
        if (sueldo >= 3000) {
            prestamoMaximo = sueldo * 5;
        } else {
            prestamoMaximo = sueldo * 2;
        }
        
        System.out.println("Puede solicitar un préstamo de hasta: S/" + prestamoMaximo);
    }
}

