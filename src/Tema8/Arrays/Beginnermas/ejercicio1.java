package Tema8.Arrays.Beginnermas;

import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        /**
         * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre -100 y
         * 100. Debes conseguir que todos los números pares del array cambien de signo, los positivos
         * deben pasar a negativos y viceversa. Debes realizar el ejercicio mediante un método que
         * admita el array como argumento y realice la acción pedida. Cabecera del método 'public static
         * void cambiaSignoEnValores(int array[])'
         */

        Scanner sc = new Scanner (System.in);

        int [] nElementos = new int [5];
        inicializarArray(nElementos);
        cambiaSignoEnValores(nElementos);
        System.out.println("Para subir al GIT");
    }

    private static void inicializarArray(int [] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            nElementos[i] = (int)numeroAletaorio(-100,100);
        }
    }

    private static void cambiaSignoEnValores(int[] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            System.out.println("El valor de la i es: " + nElementos[i]);
            if (nElementos[i] %2 == 0){
                System.out.println("El numero:" + nElementos[i] + " es par");
                nElementos[i] = nElementos[i] * (-1);
                System.out.println("El cambio de signo es " + nElementos[i]);
            }
        }

    }

    private static int numeroAletaorio(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max-min+1)+min;
    }


}
