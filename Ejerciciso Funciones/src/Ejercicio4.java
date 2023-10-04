//Ej. 4:
// ej 8 generales
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num;
        System.out.println("Ingrese cuántos valores de la serie de Fibonacci desea ver:");
        num = reader.nextInt();
        fibo(num);
    }
    public static void fibo(int num){
        int num2=0, temp=1, fib;
        for (int i=1;i<=num; i++){
            if (i==1){
                System.out.println("1");
            }else{
                fib = num2 + temp;
                System.out.print(", "+fib);
                num2 = temp;
                temp = fib;
            }
        }
    }
}
