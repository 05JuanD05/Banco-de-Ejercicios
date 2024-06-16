import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Ingrese un Dato: ");
            double d1 = sc.nextDouble();

            System.out.println("Ingrese el segundo Dato: ");
            double d2 = sc.nextDouble();

            System.out.println("Ingrese el Tercer Datos: ");
            double d3 = sc.nextDouble();

            double mediaArit = (d1 + d2 + d3) / 3;

            System.out.println("La media Aritmetica ingresada es de: " + mediaArit);
        } catch(Exception e){
            System.out.println("Solo se puede ingresar Datos Numericos.");
        }
    }
}

// 6. Programa que calcula a media aritmetica de tres numeros cualesquiera dados por el usuario.