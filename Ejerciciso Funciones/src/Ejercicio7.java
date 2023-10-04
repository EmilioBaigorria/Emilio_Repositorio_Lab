//Ej. 7:
// ej 18 generales
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número y lo daré vuelta:");
        num = reader.nextInt();
        inverter(num);
    }
    public static void inverter(int num){
        int temp, originalNumber=num, invertedNumber=0;
        while (num!=0){
            temp = num % 10;
            invertedNumber = invertedNumber * 10 + temp;
            num = num / 10;
        }
        System.out.println("El numero original es "+originalNumber);
        System.out.println("El numero invertido es "+invertedNumber);
    }
}
