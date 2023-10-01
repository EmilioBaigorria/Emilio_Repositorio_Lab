import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //  COMPROBAR SI UN NÚMERO ES CAPICÚA EN JAVA
        //Un número es capicúa si se puede leer igual de derecha a izquierda que de izquierda a derecha.
        Scanner input=new Scanner(System.in);
        int number,invertedNumber=0,temp,ogNumber;
        System.out.println("Ingresa un numero y comprobare si es capicua");
        number=input.nextInt();
        ogNumber=number;
        while (number!=0){
            temp=number%10;
            invertedNumber=invertedNumber*10+temp;
            number=number/10;
        }
        if (invertedNumber==ogNumber){
            System.out.println("Es capicula");
        }
        else {
            System.out.println("No es capicua");
        }
    }
}