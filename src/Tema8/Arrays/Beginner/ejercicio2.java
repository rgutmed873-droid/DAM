package Tema8.Arrays.Beginner;

import java.util.Random;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int array[] = new int[150];
        Random rand = new Random();

        System.out.println("Dime el límite inferior:");
        int limiteInferior = sc.nextInt();
        System.out.println("Dime el límite superior:");
        int limiteSuperior = sc.nextInt();

        // Validación de límites
        if (limiteInferior > limiteSuperior) {
            System.out.println("El límite inferior no puede ser mayor que el superior.");
            sc.close();
            return;
        }

        // Llenar el array con números aleatorios
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
        }

        // Mostrar el array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

