import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Mostrar los numeros perfectos entre el 1 y el 1000
        //Un número es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio número.
        //Por ejemplo, el número 6 es perfecto.
        //Si sumamos 1 + 2 + 3 = 6
        Scanner input = new Scanner(System.in);
        int num,number_total=0;
        for (int p=1;p<=1000;p++) {
            num = p;
            number_total=0;
            for (int i = 1; i <= num - 1; i++) {
                if (num % i == 0) {
                    number_total = number_total + i;
                }
            }
            if (num == number_total) {
                System.out.println(num+" es perfecto");
            }
        }
    }
}