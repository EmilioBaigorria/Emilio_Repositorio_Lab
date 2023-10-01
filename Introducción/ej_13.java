package Introducción;
import java.util.Scanner;
//Programa java para comprobar si un año es bisiesto.
//El programa pide que se introduzca el valor de un año por teclado y calcula si es un año bisiesto o no lo es.
//Un año es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400.
public class ej_13 {
    public static void main(String[] args) {

        int year;

        System.out.println("Ingrese un año: ");
        Scanner n1 = new Scanner(System.in);
        year = n1.nextInt();
        if ((year%4==0 && year%100!=0)||(year%400==0)) {
            System.out.println("El año " + year + " es bisiesto.");
        } else {
            System.out.println("El año " + year + " NO es bisiesto.");
        }
    }
}