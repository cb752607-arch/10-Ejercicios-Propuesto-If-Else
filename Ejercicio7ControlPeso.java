import java.util.Scanner;

public class Ejercicio7ControlPeso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = entrada.nextDouble();
        
        if (peso > 50) {
            double sobrepeso = peso - 50;
            System.out.println("El paquete excede el límite. Sobrepasa por: " + sobrepeso + " kg.");
        } else {
            System.out.println("El paquete es aceptado (está dentro del límite de 50 kg).");
        }
    }
}
