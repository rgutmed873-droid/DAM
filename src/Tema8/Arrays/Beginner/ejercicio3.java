package Tema8.Arrays.Beginner;

import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int array[] = new int[150];
        Random rand = new Random();
        System.out.println(rand);

        //Este bucle es para darle valores al array
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101);

        }

        //Mostrar el array en orden inverso
        for (int i = array.length-1; i >=0; i--) {
            System.out.println(array[i]);
        }

    }
}
