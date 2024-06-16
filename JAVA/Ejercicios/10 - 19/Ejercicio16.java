import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite su nota: ");
            double nota1 = sc.nextDouble();

            if(nota1 > 3.0){
                System.out.println("Gano la Materia");
            }else if(nota1 == 3.0){
                System.out.println("Paso la materia Raspao");
            }else{
                System.out.println("Perdistes la materia");
            }
        }
    }
}
// 16.	Algoritmo que determine si una persona gano o no un examen matemático