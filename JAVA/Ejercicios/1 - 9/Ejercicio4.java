import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese el Radio del Circulo: ");
            double ra = sc.nextDouble();

            double area = Math.PI * Math.pow(ra, 2);

            System.out.println("El Area " + ra + " del Circulo es de: " + area);

        } catch(Exception e){
            System.out.println("Solo se puede ingresar Datos Numericos.");
        }
    }
}

// 4. Programa que obtenga el area de un circulo, a partir de datos proporcionados por el usuario.