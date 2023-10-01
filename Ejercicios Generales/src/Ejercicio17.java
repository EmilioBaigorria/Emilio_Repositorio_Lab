import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Programa que lea un entero N y muestre por separado cada
        // una de sus cifras.
        Scanner input=new Scanner(System.in);
        int number,temp;
        String spacedNumber="";
        System.out.println("Ingresa un numero y separare sus cifras con espacios");
        number=input.nextInt();

        while (number!=0){
            temp=number%10;
            spacedNumber=Integer.toString(temp)+" "+spacedNumber;
            number=number/10;

        }
        System.out.println(spacedNumber);



    }
}