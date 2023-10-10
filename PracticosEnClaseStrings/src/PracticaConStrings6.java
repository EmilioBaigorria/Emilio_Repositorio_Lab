import java.util.Scanner;

public class PracticaConStrings6 {
    public static void main(String[] args) {
        //6. Dado un texto terminado en un punto, contar la cantidad de vocales
        Scanner input = new Scanner(System.in);
        String word,temp;
        int vocal_amount=0;
        System.out.println("Ingrese una frase y contare cuantas letras a tiene");
        word=(input.nextLine()).toLowerCase();
        for (int i=0;i<=(word.length())-1;i++){
            temp=String.valueOf(word.charAt(i));

            if (temp.equals("a") ||temp.equals("e") ||temp.equals("i") ||temp.equals("o") ||temp.equals("u")){
                vocal_amount++;

            }
        }
        System.out.println("La cantidad de vocales en la frase ingresada es de "+vocal_amount);

    }
}