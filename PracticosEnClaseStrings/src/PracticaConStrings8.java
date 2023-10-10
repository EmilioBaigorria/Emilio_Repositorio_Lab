import java.util.Scanner;

public class PracticaConStrings8 {
    public static void main(String[] args) {
        //8 -Dado un texto terminado en punto, contar la cantidad de palabras terminadas en vocal.
        Scanner input = new Scanner(System.in);
        int temp,vocal_amount=0;
        String word,temp2;
        System.out.println("Ingresese una frase y contare la cantidad de palabras terminadas en vocal");
        word=input.nextLine();
        word=(word.trim())+" ";
        temp=word.indexOf(" ");
        while (temp != -1 ){
            temp2=String.valueOf(word.charAt(temp-1));
            if (temp2.equals("a")|| temp2.equals("e")|| temp2.equals("i")|| temp2.equals("o")|| temp2.equals("u")){
                vocal_amount++;
            }
            temp=word.indexOf(" ",temp+1);
        }
        System.out.println("La cantdiad de palabras que tienen una vocal como su ultima letra son "+vocal_amount);


    }
}