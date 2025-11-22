package Tema6.Alto;

import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        /**
         * Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero).
         * Al finalizar se debe imprimir en pantalla cuantos son positivos y cuantos negativos.
         * No debes tener en cuenta el 0 (cero).
         */

        int numero;
        int numerospositivos = 0;
        int numerosnegativos = 0;
        do {
            numero = pedirNumeroUsuario("Introduce un numero");
            if (numero < 0){
                numerosnegativos++;
            }else {
                numerospositivos++;
            }

        }while (numero != 0);
        System.out.println("Operación finalizada");

        System.out.println("La cantidad de números positivos son " + numerospositivos);
        System.out.println("La cantidad de número negativo son " +  numerosnegativos);
    }

    public static int pedirNumeroUsuario(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int numeroUsuario = sc.nextInt();
        return numeroUsuario;
    }
}
