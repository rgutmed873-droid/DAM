package Tema8.Arrays.Beginnermas;

import java.util.Random;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        /**
         * 6º.- Realiza un ejercicio igual al anterior, en el que el usuario también pueda determinar la
         * dirección del movimiento. Debes realizar el ejercicio mediante un método que admita el array
         * como argumento, un número entero indicando el número de posiciones que se debe desplazar,
         * otro número que determine la dirección y realice la acción pedida. Cabecera del método 'public
         * static void desplazaCiclico (int a[], int posiciones, int direccion)'
         */

        int[] nElementos = new int[5];
        inicializarArray(nElementos);

        System.out.println("Array original:");
        mostrarArray(nElementos);

        Scanner sc = new Scanner(System.in);
        System.out.print("\n¿Cuántas posiciones vas a desplazar? ");
        int posiciones = sc.nextInt();
        System.out.print("Dime en qué dirección vas a moverlo (0 = izquierda, 1 = derecha): ");
        int direccion = sc.nextInt();

        // Llamada al método pedido en el enunciado
        desplazaCiclico(nElementos, posiciones, direccion);

        System.out.println("Array desplazado:");
        mostrarArray(nElementos);
        System.out.println();
        sc.close();
    }

    /**
     * Desplaza cíclicamente el array a la derecha o a la izquierda según 'direccion'.
     * direccion: 0 = izquierda, 1 = derecha
     */
    public static void desplazaCiclico(int a[], int posiciones, int direccion) {
        int n = a.length;
        if (n == 0) {
            return;
        }

        // Normalizar posiciones (evita desplazamientos innecesarios)
        posiciones = posiciones % n;
        if (posiciones < 0) { // por si pasan un número negativo
            posiciones = (posiciones % n + n) % n;
        }

        if (posiciones == 0) {
            return; // nada que hacer
        }

        // Convertir desplazamiento a izquierda en desplazamiento equivalente a la derecha
        // (desplazar a la izquierda p posiciones = desplazar a la derecha n - p posiciones)
        if (direccion == 0) { // izquierda
            posiciones = (n - posiciones) % n;
            if (posiciones == 0) return;
        } else if (direccion != 1) {
            // si la dirección no es 0 ni 1, consideramos por defecto derecha (o podrías lanzar error)
            // aquí se toma como derecha, sin cambiar posiciones
        }

        // ahora hacemos el desplazamiento cíclico a la derecha por 'posiciones'
        int[] temp = new int[posiciones];
        // guardamos las últimas 'posiciones' en temporal
        for (int i = 0; i < posiciones; i++) {
            temp[i] = a[n - posiciones + i];
        }
        // desplazamos el resto hacia la derecha
        for (int i = n - 1; i >= posiciones; i--) {
            a[i] = a[i - posiciones];
        }
        // colocamos los temporales al inicio
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
            nElementos[i] = numeroAleatorio(0, 100);
        }
    }

    private static int numeroAleatorio(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}

