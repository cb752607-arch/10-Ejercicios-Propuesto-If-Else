import java.util.Scanner;

public class Ejercicio10ProduccionFabrica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de piezas producidas: ");
        int piezas = entrada.nextInt();
        
        double sueldoBase = piezas * 5.0;
        double incentivo = 0.0;
        
        if (piezas > 1000) {
            incentivo = sueldoBase * 0.15;
        } else {
            incentivo = sueldoBase * 0.08;
        }
        
        double sueldoTotal = sueldoBase + incentivo;
        
        System.out.println("Sueldo base: S/" + sueldoBase);
        System.out.println("Incentivo: S/" + incentivo);
        System.out.println("Sueldo total: S/" + sueldoTotal);
    }
}
