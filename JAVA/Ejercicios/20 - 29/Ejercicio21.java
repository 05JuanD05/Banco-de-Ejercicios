import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            int A = 5;

            int B = 10;


            int temp = A;
            A = B;
            B = temp;

            System.out.println("A = " + A);
            System.out.println("B = " + B);
        }
    }
}
// 21.	Intercambiar los valores de dos variables A y B.