import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Digite un Numero: ");
            double n1 = sc.nextDouble();

            if(n1 > 0){
                System.out.println("El Numero Digita es Positivo");
            } else if(n1 == 0) {
                System.out.println("El Numero digitado es 0");
            } else {
                System.out.println("El Numero digitado es Negativo");
            }
        }
    }
}

// 7. Programa para determinar si un numero dado por el usuario es positivo o negativo.