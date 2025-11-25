package Matrices;

import java.util.Random;

public class ejercicio1 {
    static void main(String[] args) {
        /**
         * Realiza un programa que cree un array bidimensional,
         * una matriz, de 5 filas x 5 columnas. Una vez hecho el array,
         * realiza estos pasos:
         * Crea un método que rellena la matriz con valores creados al azar.
         */
        int [] [] matriz = new int [5][5];


        rellenar(matriz);
        imprimirmatriz(matriz);
        positivo(matriz);
        diagonal(matriz);

    }

    private static boolean diagonal(int[][] matriz) {

        //Recorrer todos los elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

            //Si no estamos en la diagonal principal
            if (i != j){

                //si el elemento no es 0 en el diagonal
                if (matriz[i][j] != 0){
                    return false;
                }
            }

            }
        }
        return true;
    }

    private static void positivo(int[][] matriz) {
        int positivos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               matriz[i][j] = numeroAleatorio(-10,10);

                if (matriz[i][j] >= 0){
                    positivos++;

                }
            }

        }
        if (positivos == 25){
            System.out.println("La matriz es positiva");
        }else {
            System.out.println("Hay numeros de ambos tipos");
        }

    }

    private static void imprimirmatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();
        }
    }

    private static void rellenar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = numeroAleatorio(-10,10);

            }
        }
    }

    public static int numeroAleatorio(int min,int max){
        Random aleatorio = new Random();
        return aleatorio.nextInt(max-min+1)+min;
    }


}
