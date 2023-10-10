import java.util.Scanner;

public class PracticaConStrings9 {
    public static void main(String[] args) {
        //9 -Dado un texto terminado en punto, mostrar la palabra mas larga.
        Scanner input = new Scanner(System.in);
        int temp,ini_pos=0;
        String word,word_temp,word_large="";
        System.out.println("Ingrese una frase y mostrare cual fue la palabra mas larga");
        word=input.nextLine();
        word=(word.trim())+" ";
        temp=word.indexOf(" ");
        while (temp != -1 ){
            word_temp=word.substring(ini_pos,temp);
            ini_pos=temp;
            if (word_temp.length()>word_large.length()){
                word_large=word_temp;
            }
            temp=word.indexOf(" ",temp+1);
        }
        System.out.println("La palabra mas larga fue: "+word_large);


    }
}