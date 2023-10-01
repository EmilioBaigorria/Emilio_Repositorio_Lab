package Introducción;

import java.util.Scanner;

public class ej_18 {
    public static void main(String[] args) {
        //Programa que pida por teclado tres números enteros, H M y S, y que sean hora minuto y segundos validos

        int hh, mm, ss;

        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese a continuación una hora (con el formato HH):");
        hh = reader.nextInt();
        while (hh>23 || hh<0) {
            System.out.println("Error. Ingrese una hora correcta y con el formato dado:");
            hh = reader.nextInt();
        }

        System.out.println("Ingrese a continuación unos minutos (con el formato MM):");
        mm = reader.nextInt();
        while (mm>59 || mm<0) {
            System.out.println("Error. Ingrese minutos correctos y con el formato dado:");
            mm = reader.nextInt();
        }

        System.out.println("Ingrese a continuación unos segundos (con el formato SS):");
        ss = reader.nextInt();
        while (ss>59 || ss<0) {
            System.out.println("Error. Ingrese segundos correctos y con el formato dado:");
            ss = reader.nextInt();
        }

        System.out.println("La hora escrita es: "+hh+":"+mm+":"+ss);

    }
}
