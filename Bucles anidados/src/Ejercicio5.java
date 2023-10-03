import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Programa Java que muestre todos los valores de un contador de 5
        // dígitos empezando por 00000 y acabando en 99999 con la
        // particularidad que cada vez que se deba mostrar un 3 se muestre E.
        Scanner input = new Scanner(System.in);
            for (int i=0;i<=9;i++){
                for (int p=0;p<=9;p++){
                    for (int c=0;c<=9;c++){
                        for (int j=0;j<=9;j++){
                            for (int v=0;v<=9;v++){
                                System.out.print(i==3?"E":i);
                                System.out.print(p==3?"E":p);
                                System.out.print(c==3?"E":c);
                                System.out.print(j==3?"E":j);
                                System.out.print(v==3?"E":v);
                                System.out.println(" ");
                            }
                        }
                    }
                }
            }




    }
}