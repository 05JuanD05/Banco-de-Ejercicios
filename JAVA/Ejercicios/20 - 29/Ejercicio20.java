import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] Seijaku_no_Seion) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("### PROMEDIO DE NOTAS ####");

            System.out.println("Ingrese la Nota 1: ");
            double not1 = sc.nextDouble();

            System.out.println("Ingrese la Nota 2: ");
            double not2 = sc.nextDouble();

            System.out.println("Ingrese la Nota 3: ");
            double not3 = sc.nextDouble();

            System.out.println("Ingrese la Nota 4: ");
            double not4 = sc.nextDouble();

            System.out.println("Ingrese la Nota 5: ");
            double not5 = sc.nextDouble();

            double sum = (not1 + not2 + not3 + not4 + not5);

            double prom = sum /5;
            
            System.out.println("La suma de las notas es de: " + sum);

            System.out.println("El promedio de las Notas es de: " + prom);

        }
    }
}
// 20.	Introducir 5 notas por teclado, obtener la suma de las notas, el promedio de las mismas y el doble de las notas.