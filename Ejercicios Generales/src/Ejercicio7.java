import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //  Programa Java que determina si dos números son amigos.
        //  Dos números son amigos si la suma de los divisores propios del primero
        //  es igual al segundo y viceversa.
        Scanner input=new Scanner(System.in);
        int anum,bnum, anumTotal=0,bnumTotal=0;
        System.out.println("Ingrese un numero");
        anum=input.nextInt();
        System.out.println("Ingrese otro numero");
        bnum=input.nextInt();
        for (int p=1;p<=anum-1;p++){
            if (anum%p==0){
                anumTotal=anumTotal+p;
            }
        }
        for (int p=1;p<=bnum-1;p++){
            if (bnum%p==0){
                bnumTotal=bnumTotal+p;
            }
        }
        if (anum==bnumTotal && bnum==anumTotal){
            System.out.println(anum+" y "+bnum+" son numeros amigos");
        }
        else {
            System.out.println();
        }
    }
}