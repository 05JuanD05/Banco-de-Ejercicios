import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese un Numero: ");
            int n1 = sc.nextInt();

            System.out.println("Ingrese otro Numero: ");
            int n2 = sc.nextInt();

            int resto = n1 % n2;

            System.out.println("El resto de la division es: " + resto);
        }
    }
}

// 8. Programa que calcule el resto de cualquier division entera.