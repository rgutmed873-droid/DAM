package Tema8.Arrays.Beginner;

import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        //Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
        // Debes mostrar el array en pantalla y obtener la suma, la media,
        // el menor y el mayor de todos los números que aparecen en el array.
        Scanner sc = new Scanner(System.in);

        int array[] = new int[150];
        Random rand = new Random();
        System.out.println(rand);
        int mayor = 100;
        int menor = 0;
        rand.doubles(menor,mayor);
        double media = 0;
        int suma = 0;
        int numeroMayor = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random()) * (mayor-menor) + menor;

            suma += array[i];

            if (array[i] > numeroMayor) {
                numeroMayor = array[i];

            }if (array[i] < numeroMenor) {
                numeroMenor = array[i];
            }
        }
        media = suma / array.length;
        System.out.println("El número mayor es " + numeroMayor);
        System.out.println("El número menor es " + numeroMenor);
        System.out.println("La suma es " + suma);
        System.out.println("El media es " + media);
        System.out.println("para subir ");
    }

}
