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


        tablero(matriz);
    }

    private static void tablero(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = numeroAleatorio(0,100);

                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static int numeroAleatorio(int min,int max){
        Random aleatorio = new Random();
        return aleatorio.nextInt(max-min+1)+min;
    }
}
