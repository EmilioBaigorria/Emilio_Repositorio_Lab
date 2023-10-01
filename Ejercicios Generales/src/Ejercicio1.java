import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        float A,B,temp;
        System.out.println("Ingrese el primer numero");
        A=input.nextFloat();
        System.out.println("Ingrese el segundo numero");
        B=input.nextFloat();
        System.out.println("Ahora voy a intercambiar sus valores");
        temp=A;
        A=B;
        B=temp;
        System.out.println("Ahora el valor de A es "+A+" y el valor de B es "+B);
        System.out.println("Ahora vamos a hacer lo mismo pero sin usar una variable auxiliar");
        System.out.println("Ingrese el primer numero");
        A=input.nextFloat();
        System.out.println("Ingrese el segundo numero");
        B=input.nextFloat();
        System.out.println("Ahora voy a intercambiar sus valores");
        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("Ahora el valor de A es "+A+" y el valor de B es "+B);

    }
}