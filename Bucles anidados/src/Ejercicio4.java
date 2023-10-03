import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Programa que muestre lo siguiente por pantalla:
        //ZYWXVUTSRQPONMLKJIHGFEDCBA
        //YWXVUTSRQPONMLKJIHGFEDCBA
        //WXVUTSRQPONMLKJIHGFEDCBA
        //XVUTSRQPONMLKJIHGFEDCBA
        //VUTSRQPONMLKJIHGFEDCBA
        //UTSRQPONMLKJIHGFEDCBA
        //TSRQPONMLKJIHGFEDCBA
        //SRQPONMLKJIHGFEDCBA
        //RQPONMLKJIHGFEDCBA
        //QPONMLKJIHGFEDCBA
        //PONMLKJIHGFEDCBA
        //ONMLKJIHGFEDCBA
        //NMLKJIHGFEDCBA
        //MLKJIHGFEDCBA
        //LKJIHGFEDCBA
        //KJIHGFEDCBA
        //JIHGFEDCBA
        //IHGFEDCBA
        //HGFEDCBA
        //GFEDCBA
        //FEDCBA
        //EDCBA
        //DCBA
        //CBA
        //BA
        //A
        Scanner input = new Scanner(System.in);
        for (char p='Z';p>='A';p--) {
            for (char i = p; i >= 'A'; i--) {
                System.out.print(i);
            }
            System.out.println(" ");
        }



    }
}