//Ej. 2:
// ej 15 generales
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero y calculare su factorial");
        num=reader.nextInt();
        System.out.println("El factorial de "+num+" es "+factorial(num));
    }
    public static int factorial(int num){
        int facto = 1;
        for (int i=1; i<=num;i++){
            facto=facto*i;
        }
        return facto;
    }
}
