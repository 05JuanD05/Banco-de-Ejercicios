import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Ingrese la cantidad de grados centigrados: ");
            double gc = sc.nextDouble();

            double fahre = ((gc * 9) / 5) + 32;

            System.out.println("los Grados Fahrenheir a centigrados son: " + fahre);
        }
    }
}
/* 25.	Programa que de acuerdo a una cantidad de grados centígrados ingresadas por teclado,
realice la conversión a grados fahrenheit. (Multiplica por 9, divide entre 5, después suma 32) */