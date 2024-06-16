import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese una cantidad de pulagadas: ");
            double pulga = sc.nextDouble();

            double centi = pulga * 2.54;

            System.out.println(+ pulga + " Pulgadas en centimetros son: " + centi);
        }
    }
}
// 24.	Programa que de acuerdo a una cantidad de pulgadas ingresadas por teclado, realice la conversión a centímetros. (1plg=2.54cm).