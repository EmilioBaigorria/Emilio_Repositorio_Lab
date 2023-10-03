import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Leer un numero N y calcular el factorial de los numeros desde 0 hasta N
        //Si n = 0 entonces 0! = 1
        //Si n > 0 entonces
        //n! = n * (n – 1) * (n – 2) * …. * 3 * 2 * 1
        //Por ejemplo, n = 5 entonces
        //5! = 5 * 4 * 3 * 2 * 1 = 120
        Scanner input = new Scanner(System.in);
        int num;
        double number_total;
        System.out.println("Ingrese un numero positivo y entero, mostrare los factoriales de los numeros desde el 0 hasta el numero ingresado");
        num=input.nextInt();
        for (int p=0;p<=num;p++) {
            number_total=1;
            if (p==0){
                System.out.println("0!=1");
            }else {
                for (int i = 1; i <= p ; i++) {
                    number_total = number_total * i;
                }
                System.out.println(p + "!=" + number_total);
            }
        }


    }
}