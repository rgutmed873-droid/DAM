package Tema8.Arrays.Beginnermas;

import java.util.Random;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        /**
         * 2º.- Realiza un ejercicio que inicialice dos arrays de 150 elementos enteros al azar entre 0 y
         * 100. Debes crear un tercer array, compuesto de la siguiente forma: en los elementos de índice
         * impar del tercer array debes copiar los elementos de índice impar del primer array; en los
         * elementos de índice par del tercer array debes copiar los elementos de índice par del segundo
         * array. Debes realizar el ejercicio mediante un método que admita los arrays como argumentos y
         * realice la acción pedida. Cabecera del método 'public static int[] creaTercerArray (int a1[], int
         * a2[])'
         */

        Scanner sc = new Scanner(System.in);
        int longitudArray = 10;
        int [] nElementos = new int [longitudArray];
        int [] nElementos2 = new int [longitudArray];

        inicializarArray(nElementos);
        inicializarArray(nElementos2);
        int [] array3 = crearTercerArray(nElementos,nElementos2);
    }

    private static int[] crearTercerArray(int[] nElementos, int[] nElementos2) {
        int [] array3 = new int[nElementos.length];

        for (int i = 0; i < array3.length; i++) {
            if (i % 2 == 0) {
                array3[i] = nElementos2[i];
                System.out.println("El valor del array es: " + array3[i]);
            }else {
                array3[i] = nElementos[i];
                System.out.println("El valor del array es: " + array3[i]);
            }
        }
        return array3;
    }

    private static void inicializarArray(int [] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            nElementos[i] = numeroAleatorio(0,100);
        }
    }

    private static int numeroAleatorio(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max-min +1)+min;
    }

}
