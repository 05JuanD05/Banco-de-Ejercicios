import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese el Numero: ");
            int num = sc.nextInt();

            int cuadrado = num * num;

            System.out.println("El cuadrado de " + num + " es de: " + cuadrado);
        }
    }
}
// 18.	Calcular y escribir el cuadrado de 125.