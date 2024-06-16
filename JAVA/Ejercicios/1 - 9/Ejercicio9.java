import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Ingrese un Monto: ");
            double monto = sc.nextDouble();

            double porcenIva = 19;

            double iva = (monto * porcenIva) / 100;

            System.out.println("El Iva del monto es de: " + iva);
        }
    }
}

// 9. Programa que obtenga el IVA sobre una cantidad dada por el usuario.