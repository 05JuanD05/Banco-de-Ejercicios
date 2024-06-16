import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Introduzca el Sueldo basico: ");
            double sueldo = sc.nextDouble();

            System.out.println("Ingrese el Monto por horas extras: ");
            double monto = sc.nextDouble();

            double totalganado = (sueldo * monto);

            double descu = totalganado * 0.20;

            double totalganades = totalganado - descu;

            System.out.println("El sueldo basico es de: " + sueldo);

            System.out.println("El descuento es de: " + totalganades);

            System.out.println("El total ganado es de: " + totalganado);
        }
    }
}
/*19.	Introducir el sueldo básico de un empleado por teclado,
hallar el total ganado considerando que debe introducir el monto por horas extras, 
considerar undescuento del 20%. Desplegar el sueldo básico, el total del descuento y el total ganado*/