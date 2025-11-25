package Tema6.Rookie.Medio;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        /**
         * 1º.- Crea un programa que compruebe si un número es primo o no.
         * Debes pedir al usuario un número y después informar de si se trata de un número primo o compuesto.
         * Tienes prohibido el uso del bucle "for"
         */
        int numero;

    }

    public static int pedirNumeroUsuario(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int numeroUsuario =  sc.nextInt();
        return numeroUsuario;
    }
}
