package Tema6.Medios;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        /**
         * 2º.- Mayor y menor de una cantidad de números dada por el usuario.
         * El usuario introducirá una cantidad de números,
         * tras lo cual se le deben pedir tantos como este haya indicado.
         * Al final se debe imprimir el mayor y el menor de todos los introducidos.
         */

        Scanner sc = new Scanner(System.in);
        int num = pedirNumeroUsuario("Dame la cantidad de numeros que vas a introducir");

        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Introduce los numeros");
            int numero = sc.nextInt();
            if (i == 0) {
                mayor = numero;
                menor = numero;
            } else{
             if (numero > mayor) {
                 mayor = numero;
             }
             if (numero < menor) {
                 menor = numero;
             }
            }
        }
        System.out.println("El número mayor es " + mayor);
        System.out.println("El número menor es " + menor);
    }

    public static int pedirNumeroUsuario(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int numeroUsuario = sc.nextInt();
        return numeroUsuario;
    }
}
