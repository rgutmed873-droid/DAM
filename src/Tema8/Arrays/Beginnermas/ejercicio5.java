package Tema8.Arrays.Beginnermas;

import java.util.Random;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        /**
         * 5º.- Realiza un ejercicio igual al anterior, pero en el que el usuario pueda indicar la cantidad de
         * posiciones que deseamos desplazar. Debes realizar el ejercicio mediante un método que
         * admita el array como argumento, un número entero indicando el número de posiciones que se
         * debe desplazar y realice la acción pedida. Cabecera del método 'public static void
         * desplazaCiclicoDerecha (int a[], int posiciones)'
         */

        int [] nElementos = new int[5];
        inicializarArray(nElementos);

        System.out.println("Array original");
        mostrarArray(nElementos);

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas posiciones vas a desplazar?");
        int posiciones = sc.nextInt();

        desplazaCicloDerecha(nElementos,posiciones);

        System.out.println("Array desplazada");
        mostrarArray(nElementos);
    }

    private static void desplazaCicloDerecha(int[] a, int posiciones) {

        int n = a.length;

        int [] temp = new int[posiciones];

        //Guardar los últimas posiciones de la array temporal
        for (int i = 0; i < posiciones; i++) {
           temp[i] = a[n-posiciones+i];
        }

        //Movemos el resto hacia la derecha
        for (int i = n-1; i >=posiciones ; i--) {
            a[i] = a[i-posiciones];
        }

        //Coloco los temporales al inicio
        for (int i = 0; i < posiciones; i++) {
            a[i] = temp[i];
        }
    }


    private static void mostrarArray(int[] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            System.out.print(nElementos[i] + " ");
        }
    }

    private static void inicializarArray(int[] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            nElementos[i] = numeroAleatorio(0,100);
        }
    }

    private static int numeroAleatorio(int min, int max) {

        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
