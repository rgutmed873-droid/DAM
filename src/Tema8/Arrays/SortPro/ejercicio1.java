package Tema8.Arrays.SortPro;

import java.util.Random;

public class ejercicio1 {
    public static void main(String[] args) {
        /**
         * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y
         * 1.000. Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación
         * llamado "Burbuja", con el objetivo de ordenar el array completamente. Puedes consultar el
         * siguiente enlace http://lwh.free.fr/pages/algo/tri/tri_bulle_es.html
         */

        int [] nElementos = new int[10];
        inicializarArray(nElementos);
        System.out.println("Array sin ordenar");
        mostrarArray(nElementos);

        ordenacionBurbuja(nElementos);

        System.out.println("\n\nArray ordenada");
        mostrarArray(nElementos);



    }

    /**
     * Metodo para ordenar en burbuja número aleatorios
     * @param nElementos
     */
    private static void ordenacionBurbuja(int[] nElementos) {
        int iteracion = 0;

        boolean cambio = true;
        //Mientras hayan intercambios, seguimos pasando
        while (cambio) {
            cambio = false;
            //En cada pasada podemos reducir en 1 la porción a comparar
            for (int i = 0; i < nElementos.length-1-iteracion; i++)
                if (nElementos[i] > nElementos[i + 1]) {
                    cambio = true;
                    //Intercambio de los valores
                    int temp = nElementos[i];
                    nElementos[i] = nElementos[i + 1];
                    nElementos[i + 1] = temp;
                }
            iteracion++;
        }
    }

    /**
     * Metodo para mostrar la array
     * @param nElementos
     */
    private static void mostrarArray(int[] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            System.out.print(nElementos[i] + " ");
        }
    }

    /**
     * Metodo para inicializarla con numeros aleatorios
     * @param nElementos
     */
    private static void inicializarArray(int[] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            nElementos[i] = numeroAleatorios(0,1000);
        }
    }

    /**
     * Metodo para generar números aleatorios
     * @param min el número minimo que se va a generar
     * @param max el número máximo que se va a generar
     * @return que devuelva el que genera
     */
    private static int numeroAleatorios(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
