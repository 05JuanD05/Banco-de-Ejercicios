import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese un numero: ");
            double n1 = sc.nextDouble();

            System.out.println("Ingrese otro numero: ");
            double n2 = sc.nextDouble();

            System.out.println("Ingrese el ultimo numero: ");
            double n3 = sc.nextDouble();

            double prom = (n1 + n2 + n3) / 3;

            double sum = (n1 + n2 + n3);

            double dobleprim = (n1 * 2);

            double cuadrado = Math.pow(n3, 2);
            

            System.out.println("El Promedio de los 3 numero es de: " + prom);

            System.out.println("El Promedio de los 3 numero es de: " + sum);

            System.out.println("El Promedio de los 3 numero es de: " + dobleprim);

            System.out.println("El Promedio de los 3 numero es de: " + cuadrado);
        }
    }
}
// 12.	Introducir tres números por teclado, hallar el promedio de los tres números, la suma y desplegar del primer número el doble, del segundo número el triple y del tercer número el cuadrado