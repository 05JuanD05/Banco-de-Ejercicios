import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese un Numero Real: ");
            double real = sc.nextDouble();

            int nrentero = (int) real;

            double nrodecimal = real - nrentero;

            System.out.println("La parte entera del Numero: " + nrentero);
            System.out.println("Numero Decimal: " + nrodecimal);
        }
    }
}
// 22.	Introducir un número real, mostrar la parte entera y la parte decimal del número.