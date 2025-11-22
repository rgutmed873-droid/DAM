package Tema5.Altos;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        /**
         * 2º.- Realiza una calculadora avanzada, pero con la particularidad de que las operaciones
         * deben ser raices, potencias y el módulo de la división.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA AVANZADA ELIGE UNA OPCION");
        System.out.println("\t 1. Raices cuadradas");
        System.out.println("\t 2. Potencias");
        System.out.println("\t 3. Módulo de divison");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Dame un número para la raíz cuadra");
                int num = sc.nextInt();
                double raiz = Math.sqrt(num);
                System.out.println("El resultado de la raíz cuadra es " + raiz);
                break;
            case 2:
                System.out.println("Dame la base para la potencia");
                int base = sc.nextInt();
                System.out.println("Dame el exponente para la potencia");
                int exponente = sc.nextInt();
                int potencia = (int )Math.pow(base,exponente);
                System.out.println("El resultado de la potencia es " + potencia);
                break;
            case 3:
                System.out.println("Dame el dividendo ");
                int dividendo = sc.nextInt();
                System.out.println("Dame el divisor");
                int divisor = sc.nextInt();
                int modulo = dividendo % divisor;
                System.out.println("El resultado del módulo de la divison es " + modulo);
                break;
        }
    }
}
