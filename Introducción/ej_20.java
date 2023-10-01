package Introducción;
/*
 * Pasar una calificación numérica a alfabética
 * Programa que lee una calificación numérica entre 0 y 10 y escribe su
 * correspondiente calificación alfabética
 */

import java.util.Scanner;

public class ej_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.print("Introduzca nota entre 0 y 10: ");
        nota = sc.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota incorrecta");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}