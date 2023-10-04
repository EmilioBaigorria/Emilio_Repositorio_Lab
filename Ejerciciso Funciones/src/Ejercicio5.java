//Ej. 5:
// ej 17 generales
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número y separaré sus cifras con espacios:");
        num = reader.nextInt();
        System.out.println(separator(num));
    }
    public static String separator(int num){
        int temp;
        String spacedNumber="";
        while (num!=0){
            temp = num % 10;
            spacedNumber = Integer.toString(temp)+" "+spacedNumber;
            num = num / 10;
        }
        return spacedNumber;
    }
}
