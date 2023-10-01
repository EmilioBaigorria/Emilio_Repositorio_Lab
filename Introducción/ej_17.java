package Introducción;

import java.util.Scanner;

public class ej_17 {
    public static void main(String[] args) {

        int num1, num2, num3, biggest=0;

        System.out.println("Ingrese un primer número:");
        Scanner n1 = new Scanner(System.in);
        num1 = n1.nextInt();

        if (num1>biggest)
            biggest = num1;

        System.out.println("Ingrese un segundo número:");
        Scanner n2 = new Scanner(System.in);
        num2 = n2.nextInt();

        if (num2>biggest)
            biggest = num2;

        System.out.println("Ingrese un tercer número:");
        Scanner n3 = new Scanner(System.in);
        num3 = n3.nextInt();

        if (num3>biggest)
            biggest = num3;

        System.out.println("El número más alto de los ingresados es el "+biggest);

    }
    
}
