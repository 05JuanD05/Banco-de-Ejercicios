import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese la base del Triangulo: ");
            double base = sc.nextDouble();

            System.out.println("Ingrese la longitud del Triangulo: ");
            double longi = sc.nextDouble();


            double area = (base * longi);

            System.out.println("El Area del Rectangulo es de: " + area);
        }
    }
}

// 11. Hallar el area del Rectangulo