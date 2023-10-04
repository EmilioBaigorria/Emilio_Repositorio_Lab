//Ej. 10:
// ej 16 generales
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número y verificaré si es primo:");
        num = reader.nextInt();
        primeNumber(num);
    }
    public static void primeNumber(int num){
        int primeChecker=0;
        for (int i=2;i<num;i++){
            if (num%i==0){
                primeChecker=1;
            }
        }
        if (primeChecker==0){
            System.out.println("El número "+num+" es primo");
        } else {
            System.out.println("El número "+num+" no es primo");
        }
    }
}