package Tema8.Arrays.Beginnermas;

import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        /**
         * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
         * Debes conseguir multiplicar cada uno de los elementos del array por un número determinado,
         * pedido al usuario. Debes realizar el ejercicio mediante un método que admita el array como
         * argumento, además del número por el que multiplicar y realice la acción pedida. Cabecera del
         * método 'public static void multiplicaValoresPorFactor (int a[], int factor)'
         */

        int [] nElementos = new int[5];
        int factor = pedirNumeroUsuario("Dame un numero");
        inicializarArray(nElementos);
        multiplicarValoresPorFactor(nElementos, factor);
    }

    private static void multiplicarValoresPorFactor(int[] nElementos, int factor) {

        for (int i = 0; i < nElementos.length; i++) {

            nElementos[i] = nElementos[i] * factor;
            System.out.println("El resultado es " + nElementos[i]);
        }
    }

    private static void inicializarArray(int[] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            nElementos[i] = numeroAleatorio(100,0);
        }
    }

    private static int numeroAleatorio(int max, int min) {

        Random rand = new Random();
        return rand.nextInt(max-min+1)+min;
    }
    public static int pedirNumeroUsuario(String msg) {

        Scanner sc = new Scanner(System.in);
        System.out.println(msg);

        int numeroUsuario = sc.nextInt();

        return numeroUsuario;
    }
}
