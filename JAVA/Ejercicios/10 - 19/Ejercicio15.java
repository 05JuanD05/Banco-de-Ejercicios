import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] Seijaku_no_Seion){

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese un dato: ");
            int edad = sc.nextInt();


            if(edad >= 18 ){
                System.out.println("Es Mayor de edad");
            }else{
                System.out.println("Es Menor de Edad");
            }
        }

    }
}
// 15.	Algoritmo que determine si una persona es mayor o menor de edad