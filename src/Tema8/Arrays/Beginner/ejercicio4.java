package Tema8.Arrays.Beginner;

import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un valor");
        int numUsuario = sc.nextInt();

        int [] array = new int[10];
        inicializarArray(array);
        buscarValor(array,numUsuario);

    }

    private static void inicializarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = pedirNumeroAleatorio(0,10);
        }
    }

    private static void buscarValor(int[] array, int numUsuario) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Valor de la: " + array[i]);
            if (array[i] == numUsuario){
                System.out.println("Has encontrado el valor en la posición" + i);

            }else {
                System.out.println("No has encontrado el valor de la array");
            }
        }

    }

    public static int pedirNumeroAleatorio(int min, int max) {

        Random random = new Random();
        return random.nextInt(max-min +1) + min;
    }

}
