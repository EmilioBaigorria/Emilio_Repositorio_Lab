//Ej. 8:
// ej 22 generales
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número y reemplazaré sus cifras por el nombre:");
        num = reader.nextInt();
        System.out.println(rename(num));
    }
    public static String rename(int num){
        int temp;
        String wordedNumber="";
        while (num!=0){
            temp = num % 10;
            if (temp==0){
                wordedNumber = "Cero, "+wordedNumber;
            } else if (temp==1){
                wordedNumber = "Uno, "+wordedNumber;
            } else if (temp==2){
                wordedNumber = "Dos, "+wordedNumber;
            } else if (temp==3){
                wordedNumber = "Tres, "+wordedNumber;
            } else if (temp==4){
                wordedNumber = "Cuatro, "+wordedNumber;
            } else if (temp==5){
                wordedNumber = "Cinco, "+wordedNumber;
            } else if (temp==6){
                wordedNumber = "Seis, "+wordedNumber;
            } else if (temp==7){
                wordedNumber = "Siete, "+wordedNumber;
            } else if (temp==8){
                wordedNumber = "Ocho, "+wordedNumber;
            } else if (temp==9){
                wordedNumber = "Nueve, "+wordedNumber;
            }
        }
        return wordedNumber;
    }
}
