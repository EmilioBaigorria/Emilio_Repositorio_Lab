import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        //Transformar un número invirtiendo el orden de sus cifras
        Scanner input=new Scanner(System.in);
        int number,invertedNumber=0,temp,ogNumber;
        System.out.println("Ingresa un numero y lo dare vuelta");
        number=input.nextInt();
        ogNumber=number;
        while (number!=0){
            temp=number%10;
            invertedNumber=invertedNumber*10+temp;
            number=number/10;
        }
        System.out.println("El numero original es: "+ogNumber+"\nEl numero invertido es: "+invertedNumber);

    }
}