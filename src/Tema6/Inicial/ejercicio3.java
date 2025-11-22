package Tema6.Inicial;

import java.util.Scanner;

public class ejercicio3 {
    static void main(String[] args) {
        /**
         * 3º.- Realiza un ejercicio que pida números al usuario, tantos como indique el usuario.
         * al final debe aparecer cuantos números positivos y negativos se han introducido.
         */
        Scanner sc = new Scanner(System.in);
        int numeroUsuario = pedirNumeroUsuario("Dame cuantos números vas a introducir");
        int numerosNegativos = 0;
        int numerosPositivos = 0;

        for (int i = 0; i < numeroUsuario; i++) {
            System.out.println("Dame los número " + i);
            int numero = sc.nextInt();
            if (numero < 0){
            numerosNegativos++;
            }else {
                numerosPositivos++;
            }
        }
        System.out.println("La cantidad de números positivos son: " + numerosPositivos);
        System.out.println("La cantidad de números negativos  son " + numerosNegativos);
    }

    public static int pedirNumeroUsuario(String msg) {

        Scanner sc = new Scanner(System.in);
        System.out.println(msg);

        int numeroUsuario = sc.nextInt();

        return numeroUsuario;
    }
}
