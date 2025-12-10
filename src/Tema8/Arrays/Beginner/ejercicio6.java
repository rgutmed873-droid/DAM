package Tema8.Arrays.Beginner;

import java.util.Random;
import java.util.Scanner;

public class ejercicio6 {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] nElementos = new int [100];

        inicializarArray(nElementos);
        sumaElementos(nElementos);

    }

    private static void sumaElementos(int[] nElementos) {

        int sumaIndicePar = 0;

        for (int i = 0; i <nElementos.length; i++) {

            if (i %2 == 0) {
                System.out.println(i + " es par");
                sumaIndicePar += i;
            }

        }
        System.out.println("La suma es: " + sumaIndicePar);
    }

    private static void inicializarArray(int[] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            nElementos[i] = (int)pedirNumeroAleatorio(0,100);
        }

    }


    public static int pedirNumeroAleatorio(int min, int max) {

        Random rand = new Random();
        return rand.nextInt(max-min +1) + min;
    }
}
