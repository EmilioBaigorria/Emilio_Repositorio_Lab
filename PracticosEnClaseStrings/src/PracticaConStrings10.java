import java.util.Scanner;

public class PracticaConStrings10 {
    public static void main(String[] args) {
        //10 -Dado un texto terminado en punto, mostrar la palabra con más consonantes seguidas.
        Scanner input = new Scanner(System.in);
        int temp,ini_pos=0,consonant_amount=0,consonant_amount_temp=0;
        String word,word_temp,max_consonant_word="";
        System.out.println("Ingrese una frase y con mas consonantes seguidas");
        word=input.nextLine();
        word=(word.trim())+" ";
        temp=word.indexOf(" ");
        while (temp != -1 ){
            word_temp=word.substring(ini_pos,temp);
            ini_pos=temp;
            for (int i=0 ;i<word_temp.length();i++){
                System.out.println("p");
                if ("bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(word_temp.charAt(i)))){
                    System.out.println(String.valueOf(word_temp.charAt(i)));
                    if (String.valueOf(word_temp.charAt(i)).equals(String.valueOf("bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(word_temp.charAt(i+1)))))){
                        System.out.println("j");
                        consonant_amount++;
                    }
                }
            }
            if (consonant_amount>consonant_amount_temp){
                max_consonant_word=word_temp;
                consonant_amount_temp=consonant_amount;
            }
            consonant_amount=0;
            temp=word.indexOf(" ",temp+1);
        }
        System.out.println("La palabra con mas cosonantes seguidas fue: "+max_consonant_word+" con "+consonant_amount_temp+" consonantes seguidas");


    }
}