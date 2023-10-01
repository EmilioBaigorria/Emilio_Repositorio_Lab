package Introducción;

import java.util.Scanner;
// Programa java que lee dos números distintos por teclado y calcula y muestra el resultado de dividir el mayor entre el menor
public class ej_16 {
    public static void main(String[] args) {
        float num1, num2, result;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        num1 = reader.nextInt();
        System.out.println("Ingrese otro número:");
        num2 = reader.nextInt();
        if (num1==num2)
            System.out.println("Los números son iguales.");
        else if (num1>num2 && num2!=0){
            result = num1/num2;
            System.out.println(num1+"/"+num2+"="+result);
        } else if (num2>num1 && num1!=0){
            result = num2/num1;
            System.out.println(num2+"/"+num1+"="+result);
        }




    }
}
