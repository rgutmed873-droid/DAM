package Tema8.Arrays.Beginner;

import java.util.Random;
import java.util.Scanner;

public class ejercicio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nElementos = new int[5];


        inicializarArray(nElementos);
        sumaNumeros(nElementos);

    }
    private static void inicializarArray(int[] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            nElementos[i] = pedirNumeroAleatorio(0,10);
        }
    }

    private static void sumaNumeros(int[] nElementos) {

        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < nElementos.length; i++) {
            System.out.println("Valor del numero " + nElementos[i]);
            if (nElementos[i] %2 == 0){
                System.out.println(nElementos[i] + " es par");
                sumaPares += nElementos[i];

            }else {
                System.out.println(nElementos[i] + " es impar");
                sumaImpares += nElementos[i];

            }
        }
        System.out.println("La suma de los números pares son " + " " + sumaPares);
        System.out.println("Las sumas de los numeros impares son " + " " + sumaImpares);
    }

    public static int pedirNumeroAleatorio(int min, int max) {

        Random random = new Random();
        return random.nextInt(max-min +1) + min;
    }
}
