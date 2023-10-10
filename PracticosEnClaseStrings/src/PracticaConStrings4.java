import java.util.Scanner;

public class PracticaConStrings4 {
    public static void main(String[] args) {
        //4	- Dado un texto terminado en un punto, contar la cantidad de "a".
        Scanner input = new Scanner(System.in);
        String word,temp;
        int a_amount=0;
        System.out.println("Ingrese una frase y contare cuantas letras a tiene");
        word=(input.nextLine()).toLowerCase();
        for (int i=0;i<=(word.length())-1;i++){
            temp=String.valueOf(word.charAt(i));

            if (temp.equals("a")){
                a_amount++;

            }
        }
        System.out.println("La cantidad de a en la frase ingresada es de "+a_amount);

    }
}