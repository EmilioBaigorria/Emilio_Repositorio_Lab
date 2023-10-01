import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        //  Programa que pide por teclado un entero positivo y
        //   lo mostrará cambiando cada cifra por su nombre.
        //   Los nombres de las cifras aparecerán separados por un guión.
        Scanner input=new Scanner(System.in);
        int number,temp;
        String wordedNumber="";
        System.out.println("Ingrese un numero y lo mostrare de una manera especial");
        number=input.nextInt();
        while (number!=0){
            temp=number%10;
            if (temp==0){
                wordedNumber="Cero,"+wordedNumber;
            } else if (temp==1) {
                wordedNumber="Uno,"+wordedNumber;

            } else if (temp==2) {
                wordedNumber="Dos,"+wordedNumber;

            } else if (temp==3) {
                wordedNumber="Tres,"+wordedNumber;

            } else if (temp==4) {
                wordedNumber="Cuatro,"+wordedNumber;

            } else if (temp==5) {
                wordedNumber="Cinco,"+wordedNumber;

            } else if (temp==6) {
                wordedNumber="Seis,"+wordedNumber;

            } else if (temp==7) {
                wordedNumber="Siete,"+wordedNumber;

            } else if (temp==8) {
                wordedNumber="Ocho,"+wordedNumber;

            } else if (temp==9) {
                wordedNumber="Nueve,"+wordedNumber;

            }
            number=number/10;

        }
        System.out.println(wordedNumber);



    }
}