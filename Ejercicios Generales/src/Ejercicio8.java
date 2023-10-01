import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //   Serie de Fibonacci en Java
        // * Programa que imprima los N primeros números de la serie de Fibonacci.
        // * El primer número de la serie es 1, el segundo número es 1 y cada uno de los
        // * siguientes es la suma de los dos anteriores.
        // * 1, 1, 2, 3, 5, 8, 13,  ....... , N
        Scanner input=new Scanner(System.in);
        int num,num2=0,temp=1,fib;
        System.out.println("Ingrese el cuantos numeros de la serie de fibonacci desea ver");
        num=input.nextInt();
        for (int i=1;i<=num;i++){
            if (i==1){
                System.out.println(1);
            }else {
                fib = num2 + temp;
                System.out.println(fib);
                num2 = temp;
                temp = fib;
            }
        }

    }
}