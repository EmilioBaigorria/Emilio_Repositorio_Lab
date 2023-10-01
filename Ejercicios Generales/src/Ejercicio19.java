// EJERCICIO 19
//Calcular el mayor de N números
//Programa que pide al usuario que introduzca números enteros pueden ser positivos o negativos.
// La lectura de números por teclado finaliza cuando se introduce un cero.
// El programa mostrará el mayor de todos los números introducidos.

import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, Nmayor;
        System.out.println("Ingrese un numero entero, el programa finalizara cuando se ingrese cero: ");
        num = sc.nextInt();
        Nmayor = num;

        while(num != 0){
            if (num > Nmayor){
                Nmayor = num;
            }
            System.out.println("Ingrese un numero entero: ");
            num = sc.nextInt();
        }

        if (Nmayor == 0){
            System.out.println("No se han introducido números");
        } else {
            System.out.println("El mayor número introducido ha sido: " + Nmayor);
        }
    }
}