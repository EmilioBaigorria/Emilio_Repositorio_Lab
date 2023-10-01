import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        //Programa Java que compruebe si un número es narcisista.
        //Se considera que un número es narcisista si la suma de sus cifras elevadas al número de cifras que tiene el número es igual al propio número.
        //Por ejemplo, el número 153 es un número narcisista. El número tiene 3 cifras y si sumamos cada una de sus cifras elevada al cubo el resultado es el propio número:
        //13 + 53 + 33 -> 1 + 125 + 27 -> 153
        Scanner input=new Scanner(System.in);
        int number,digitAmount=0,ogNumber,temp,totalNarci=0;
        System.out.println("Ingrese un numero y comprobare si es narcicista");
        number=input.nextInt();
        ogNumber=number;
        while (number!=0){
            number=number/10;
            digitAmount++;
        }
        number=ogNumber;
        while (number!=0){
            temp=number%10;
            totalNarci= (int) (totalNarci+ Math.pow(temp,digitAmount));
            number=number/10;
        }
        if (totalNarci==ogNumber){
            System.out.println("Es narcisista");

        }else {
            System.out.println("No es narcisista");
        }
    }
}