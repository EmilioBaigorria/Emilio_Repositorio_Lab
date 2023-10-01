import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Programa java para calcular si un número es perfecto
        Scanner input=new Scanner(System.in);
        int num, pTotal=0;
        System.out.println("Ingrese un numero para comprobar si es un numero perfecto");
        num=input.nextInt();
        for (int p=1;p<=num-1;p++){
            if (num%p==0){
                pTotal=pTotal+p;
            }
        }
        if (pTotal==num){
            System.out.println("Es un numero perfecto");
        }else{
            System.out.println("No es un numero perfecto");
        }
    }
}