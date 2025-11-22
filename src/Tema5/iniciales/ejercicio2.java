package Tema5.iniciales;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        /**
         * 2º.- Repetir el ejercicio anterior para mostrar el número menor de los dos introducidos .
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println("El numero menor es " + num1);
        }else {
            System.out.println("El número menor es " + num2);
        }

    }
}
