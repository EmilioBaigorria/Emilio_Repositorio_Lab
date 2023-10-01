import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        //  Programa Java que pida por
        //  teclado la nota obtenida por cada alumno en un examen y calcule y muestre la nota media de
        //  la clase, la nota mayor y la nota menor.
        int rep=1,totalGrade=0,grade,gradeAmount=0,maxGrade=0,minGrade=10;
        Scanner input=new Scanner(System.in);
        while (rep==1){
            System.out.println("Ingrese la nota del alumno");
            while (true) {
                grade = input.nextInt();
                if (grade>0 && grade<=10){
                    break;
                }else {
                    System.out.println("Error: El numero ingresado no esta comprendido entre 1 y 10, intenta denuevo");
                }
            }
            totalGrade=totalGrade+grade;
            gradeAmount++;
            if (grade>maxGrade){
                maxGrade=grade;
            }
            if (grade<minGrade){
                minGrade=grade;
            }
            System.out.println("¿Desea ingresar otra nota?\n[1].Si\n[2].No");
            rep=input.nextInt();
            if (rep==1){
                rep=1;
            }else {
                rep=2;
            }

        }
        if (gradeAmount>=1) {
            System.out.println("La nota mas alta de la clase fue: " + maxGrade + "\nLa nota mas baja fue: " + minGrade + "\nEl promedio de las notas fue: " + (totalGrade / gradeAmount));
        }else {
            System.out.println("La nota mas alta de la clase fue: " + maxGrade + "\nLa nota mas baja fue: " + minGrade + "\nNo se ingresron las suficientes notas para calcular un promedio");
        }



    }
}