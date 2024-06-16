import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Ingrese la longitud mayor del Rombo: ");
            double lmayor = sc.nextDouble();

            System.out.println("Ingrese la longitud menor del Rombo: ");
            double lmenor = sc.nextDouble();

            double area = (lmayor * lmenor) / 2;

            System.out.println("El Area del Rombo es de: " + area);
        } catch(Exception e){
            System.out.println("Solo se puede ingresar Datos Numericos.");
        }
    }
}

// 5. Programa que pida los datos necesarios y muestre en pantalla el area de un rombo.