//Ej. 1:
// ej 1 generales
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        float A,B;
        System.out.println("Ingrese el primer numero");
        A=reader.nextFloat();
        System.out.println("Ingrese el segundo numero");
        B=reader.nextFloat();
        System.out.println("Ahora voy a intercambiar sus valores");
        number_changer_1(A,B);
        System.out.println("Ahora vamos a hacer lo mismo pero sin usar una variable auxiliar");
        System.out.println("Ingrese el primer numero");
        A=reader.nextFloat();
        System.out.println("Ingrese el segundo numero");
        B=reader.nextFloat();
        System.out.println("Ahora voy a intercambiar sus valores");
        number_changer_2(A,B);
    }
    public static void number_changer_1(float a, float b){
        float  temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Ahora el valor de A es "+a+" y el valor de B es "+b);
    }

    public static void number_changer_2(float a, float b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Ahora el valor de A es "+a+" y el valor de B es "+b);
    }
}
