import java.util.Scanner;

public class Ejercicio17{
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese un Numero: ");
            int n1 = sc.nextInt();

            System.out.println("Ingrese otro Numero: ");
            int n2 = sc.nextInt();

            if(n1 > n2){
                System.out.println("El Numero " + n1 + " es Mayor");
            }else if(n2 > n1){
                System.out.println("El Numero " + n2 + " es Mayor");
            }else{
                System.out.println("Los Numeros son iguales");
            }
        }
    }
}

// 17.	Algoritmo que determine el número mayor de 2 leídos