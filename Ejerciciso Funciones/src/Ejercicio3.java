//Ej. 3:
// ej 2 generales
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número entero:");
        num = reader.nextInt();
        System.out.println("La cantidad de cifras que tiene "+num+" es "+numberLen(num));
    }
    public static int numberLen(int num){
        int len = 0;
        while (num!=0){
            num=num/10;
            len++;
        }
        return len;
    }
}
