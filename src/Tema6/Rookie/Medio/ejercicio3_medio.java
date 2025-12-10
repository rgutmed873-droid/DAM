package Tema6.Rookie.Medio;

import java.util.Scanner;

public class ejercicio3_medio {
    static void main(String[] args) {

        int i = 1;

        do {
            System.out.println("Tabla del " + i + ":");
            int j = 1;
            do {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }while (j<=10);
                System.out.println();
                i++;
            }while (i<=15);
        }


}
