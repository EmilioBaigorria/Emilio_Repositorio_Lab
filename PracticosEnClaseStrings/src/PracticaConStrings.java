import java.util.Scanner;

public class PracticaConStrings {
    public static void main(String[] args) {
        //1-A partir de una frase ingresada por pantalla analizar:
        //Su longitud.
        //El carácter asociado a un índice ingresado por pantalla.
        //Buscar una subcadena ingresada por pantalla.
        //El índice que ocupa el carácter 'x'.
        //La String transformada en mayúsculas
        Scanner input=new Scanner(System.in);
        int num;
        String word,character,substring;
        Boolean rep;

        System.out.println("Ingresa una frase y la voy a analizar");
        word=input.nextLine();
        System.out.println(word.length());
        System.out.println("Ingrese un numero y te mostrare en la letra que se encuentra en esa poscicion");
        while (true) {
            num=input.nextInt();
            if (num >= 0 && num <= word.length()) {
                System.out.println("El caracter que se encuentra en la poscicion " + num + ": " + word.charAt(num));
                break;
            } else {
                System.out.println("Numero no valido, intenta denuevo");
            }
        }

        System.out.println("Ingrese una subcadena para buscarla dentro de la frase");
        substring=input.next();
        rep=word.contains(substring);
        if (rep==true){
            System.out.println("La subcadena ingresada si se encuentra en la frase");

        }else {
            System.out.println("La subcadena ingresa no se encuentra en la frase");
        }
        if (word.contains("x")){
            System.out.println("La frase ingresada tiene x en la poscicion: "+word.indexOf("x"));
        } else if (word.contains("X")) {
            System.out.println("La frase ingresada tiene x en la poscicion: "+word.indexOf("X"));
        }else {
            System.out.println("La palabra ingresa no contiene x");
        }
        System.out.println("La palabra ingresa en mayusculas se ve: "+word.toUpperCase());


    }
}