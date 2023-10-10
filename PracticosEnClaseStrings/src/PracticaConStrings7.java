import java.util.Scanner;

public class PracticaConStrings7 {
    public static void main(String[] args) {
        //7 - Dado un texto terminado en punto, contar la cantidad de palabras.
        Scanner input = new Scanner(System.in);
        int temp,amount=0;
        String word;
        System.out.println("Ingresese una frase y contare la cantidad de palabras que tiene");
        word=input.nextLine();
        word=word.trim();
        temp=word.indexOf(" ");
        while (temp != -1 ){
            amount++;
            temp=word.indexOf(" ",temp+1);
        }
        System.out.println("La cantdiad de palabras que tiene la frase ingresada es de "+(amount+1));


    }
}