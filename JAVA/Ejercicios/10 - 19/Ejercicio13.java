import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese un Numero: ");
            double n1 = sc.nextDouble();

            System.out.println("Ingrese otro Numero:");
            double n2 = sc.nextDouble();

            System.out.println("Ingrese por ultimo otro Numero:");
            double n3 = sc.nextDouble();

            double ultimodigit1 = n1 % 10;

            double ultimodigit2 = n2 % 10;

            double ultimodigit3 = n3 % 10;


            System.out.println("El ultimo Digito es: " + ultimodigit1);
            System.out.println("El ultimo Digito es: " + ultimodigit2);
            System.out.println("El ultimo Digito es: " + ultimodigit3);
        }
    }
}
// 13.	Introducir tres números por teclado mostrar los últimos dígitos de cada número