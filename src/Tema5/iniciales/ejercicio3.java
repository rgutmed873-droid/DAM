package Tema5.iniciales;

import java.util.Scanner;

public class ejercicio3 {
    static void main(String[] args) {
        /**
         * 3º.- Repetir el ejercicio 1º de este bloque de ejercicios, pero pidiendo al usuario cinco
         * variables. Es decir, se pedirán al usuario cinco variables y se mostrará el mayor valor en
         * pantalla.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero ");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero ");
        int num3 = sc.nextInt();
        System.out.println("Introduce el cuarto número");
        int num4 = sc.nextInt();
        System.out.println("Introduce el quinto número");
        int num5 = sc.nextInt();

        int mayor = num1;

        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;
        if (num4 > mayor) mayor = num4;
        if (num5 > mayor) mayor = num5;

        System.out.println("El número mayor es " + mayor);
    }
}
