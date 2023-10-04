//Ej. 9:
// ej 24 generales
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número y verificaré si es narcisista:");
        num = reader.nextInt();
        narcisist(num);
    }
    public static void narcisist(int num){
        int temp, powerCounter=0, originalNumber=num, totalNarcisist=0;
        while (num!=0){
            num = num/10;
            powerCounter++;
        }
        num = originalNumber;
        while (num!=0){
            temp = num%10;
            totalNarcisist = (int) (totalNarcisist + Math.pow(temp,powerCounter));
            num = num / 10;
        }
        if (totalNarcisist==originalNumber){
            System.out.println("El número "+originalNumber+" es narcisista");
        } else {
            System.out.println("El número "+originalNumber+" no es narcisista");
        }
    }
}
