import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] Seijaku_no_Seion) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Digite el Base: ");
            double base = sc.nextDouble();

            System.out.println("Digite Altura: ");
            double altura = sc.nextDouble();

            double area = (base * altura) / 2;

            System.out.println("El Area del triangulo es de: " + area);
        } catch(Exception e){
            System.out.println("Solo se puede ingresar Datos Numericos.");
        }
    }
}

// 3. Programa que obtenga el area del triangulo, a partir de datos proporcionados por el usuario.