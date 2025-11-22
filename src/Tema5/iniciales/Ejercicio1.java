package Tema5.iniciales;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Realiza un ejercicio que pida dos variables al usuario, tras lo cual, muestre en pantalla el
         * número mayor de los dos introducidos.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println("El numero mayor es " +num2);
        }else  {
            System.out.println("El numero mayor es " +num1);
        }
    }
}
