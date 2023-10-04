//Ej. 6:
// ej 13 generales
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número y verificaré si es capicúa o no");
        num = reader.nextInt();
        palindrome(num);
    }
    public static void palindrome(int num){
        int temp, originalNumber=num, invertedNumber=0;
        while (num!=0){
            temp = num % 10;
            invertedNumber = invertedNumber * 10 + temp;
            num = num / 10;
        }
        if (invertedNumber==originalNumber){
            System.out.println("El numero "+num+" es capicúa");
        } else {
            System.out.println("El numero "+num+" no es capicúa");
        }
    }
}
