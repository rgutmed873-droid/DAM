package Tema8.Arrays.Beginnermas;

import java.util.Random;

public class ejercicio4 {
    public static void main(String[] args) {
        /**
         * Realiza un ejercicio en que inicialice un array de 5 elementos enteros al azar entre 0 y 100.
         * Debes conseguir que se desplacen los números un lugar a su derecha, de manera que el
         * desplazamiento sea circular, si un número sale por la derecha volverá a entrar por la izquierda.
         * Ejemplo: 1 2 3 4 5 pasa a ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3. Debes realizar el ejercicio
         * mediante un método que admita el array como argumento y realice la acción pedida. Cabecera
         * del método 'public static void desplazaCiclicoDerecha (int a[])'.
         */

        int [] nElementos = new int[5];
        inicializarArray(nElementos);
        System.out.println("Array original");
        mostrarArray(nElementos);

        desplazaCiclicoDerecha(nElementos);

        System.out.println("Array desplazado");
        mostrarArray(nElementos);
    }

    private static void mostrarArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    private static void desplazaCiclicoDerecha(int[] b) {
        int ultimo = b[b.length-1]; //Guardo el último numero para no perderlo

        //Desplazar el último al principp
        for (int i = b.length-1; i > 0; i--) {
            b[i] = b[i-1];
            

        }
        b[0] = ultimo; // El último pasa a primer lugar
    }

    private static void inicializarArray(int[] nElementos) {
        for (int i = 0; i < nElementos.length; i++) {
            nElementos[i] = numerosAleatorios(0,100);
        }
    }

    private static int numerosAleatorios(int min, int max) {

        Random rand = new Random();
        return rand.nextInt(max-min+1)+min;
    }
}
