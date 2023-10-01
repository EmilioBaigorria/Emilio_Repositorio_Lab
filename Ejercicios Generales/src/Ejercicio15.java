import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        //  Programa Java que muestre el factorial de un numero dado por el usuario
        //Por definición el factorial de 0 es 1
        //Para el resto de números el factorial se calcula multiplicando todos los números desde 1 hasta el propio número.
        Scanner input=new Scanner(System.in);
        int num,facto=1;
        System.out.println("Ingrese un numero y calculare su factorial");
        num=input.nextInt();
        for (int i=1; i<=num;i++){
            facto=facto*i;

        }
        System.out.println("El factorial de "+num+" es "+facto);



    }
}