import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] Seijaku_no_Seion){
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.println("Introduza un numero: ");
            int n1 = sc.nextInt();

            if(n1 >= 1000 && n1 <= 9999){
                int digito1 = n1 / 1000; // primer dígito
                int digito2 = (n1 / 100) % 10; // segundo dígito
                int digito3 = (n1 / 10) % 10; // tercer dígito
                int digito4 = n1 % 10; // Cuarto dígito

                int suma = (digito1 + digito2 + digito3 + digito4);

                System.out.println("La suma de los 4 digitos del numero es de: " + suma);
            }else{
                System.out.println("El numero no tiene 4 digitos");
            }
        }
    }
}
// 14.	Introducir un número por teclado supone que tiene cuatro dígitos, Desplegar la suma de los dígitos.