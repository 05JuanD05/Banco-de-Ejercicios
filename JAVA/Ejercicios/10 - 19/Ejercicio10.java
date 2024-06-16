import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] Seijaku_no_Seion){
        
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.println("Ingrese la Base: ");
            double base = sc.nextDouble();

            System.out.println("Ingrese la Altura: ");  
            double altura = sc.nextDouble();

            double area = (base * altura) / 2;

            System.out.println("El Area del Triangulo es de: " + area);
            
        } catch(Exception e){
            System.out.println("Solo se ingresa dato Numerico.");
        }
    }
}
// 10.	Hallar el área de un triángulo