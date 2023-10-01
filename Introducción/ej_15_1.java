package Introducción;
import java.io.IOException;
public class ej_15_1 {
    public static void main(String[] args) throws IOException {
        //15.6
        char digit;
        System.out.println("Ingresa un caracter para comprobar si es un numero o no ");
        digit=(char)System.in.read();
        if (Character.isDigit(digit)){
            System.out.println("El caracter ingresado es un numero");
        }else{
            System.out.println("El numero igresado es una letra");

        }
    }
}
