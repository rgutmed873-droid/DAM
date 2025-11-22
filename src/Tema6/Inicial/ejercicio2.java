package Tema6.Inicial;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        /**
         * 2º.- Modifica el ejercicio anterior de manera que, en lugar de que el programa
         * siempre pida cuatro números,sea el usuario el que decida cuantos números se van a pedir.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los numeros");
        int num1 = pedirNumeroUsuario("Dame los numeros");
        int sumaNumeros = 0;
        for (int i = 0; i <= num1; i++) {
            System.out.println("Introduce los números de " + i);
            int numeros = sc.nextInt();
            if (numeros > 10){
                sumaNumeros +=numeros;
            }
        }
        System.out.println("El resultado de la suma es " + sumaNumeros);
    }

    public static int pedirNumeroUsuario(String msg) {

        Scanner sc = new Scanner(System.in);
        System.out.println(msg);

        int numeroUsuario = sc.nextInt();

        return numeroUsuario;
    }
}
