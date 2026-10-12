import java.util.Scanner;

public class DesafioSalarioEmpleados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el salario bruto (S/): ");
        double salarioBruto = entrada.nextDouble();
        
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = entrada.nextInt();
        
        double impuesto = 0.0;
        if (salarioBruto > 2500) {
            impuesto = salarioBruto * 0.12;
        } else {
            impuesto = salarioBruto * 0.07;
        }
        
        double bono = 0.0;
        if (horasTrabajadas > 48) {
            bono = 300.0;
        }
        
        double salarioNeto = salarioBruto - impuesto + bono;
        
        System.out.println("\n--- BOLETA DE PAGO ---");
        System.out.println("Salario Bruto: S/ " + salarioBruto);
        System.out.println("Impuesto aplicado: S/ " + impuesto);
        System.out.println("Bono por horas: S/ " + bono);
        System.out.println("Salario Neto final: S/ " + salarioNeto);
    }
}
