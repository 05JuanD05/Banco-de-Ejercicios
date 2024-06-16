import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] Seijaku_no_Seion){

        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Digite un mensaje aqui: ");
            String a = sc.nextLine();

            System.out.println("El texto ingresado es: " + a);
        } 
    }
}

// 2. Programa que pida al usuario que ingrese un texto e imprima el mensaje "El texto Ingresado es: " junto al texto ingresado.