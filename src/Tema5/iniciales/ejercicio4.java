package Tema5.iniciales;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        /**
         * 4º.- Repetir el ejercicio 3º de este bloque de ejercicios, pero mostrando el menor valor de los
         * cinco introducidos por el usuario.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = sc.nextInt();
        System.out.println("Introduce el cuarto numero");
        int num4 = sc.nextInt();
        System.out.println("Introduce el quinto numero");
        int num5 = sc.nextInt();

        int menor = num1;

        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;
        if (num4 < menor) menor = num4;
        if (num5 < menor) menor = num5;

        System.out.println("El numero menor es " + menor);
    }
}
