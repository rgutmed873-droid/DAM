package Tema6.Alto;

import java.util.Scanner;

public class ejercicio3 {
    static void main(String[] args) {
        /**
         * 3º.- Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea 0 (cero).
         * Para cada número introducido se debe mostrar en pantalla su tabla de multiplicar, desde el 0
         * (cero) hasta el 10.
         */
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            numero = pedirNumeroUsuario("Dame el número");
            if (numero != 0){
                System.out.println("La tabla de multiplicar de " + numero);
                for (int i = 0; i <= 10; i++) {
                    System.out.println("La tabla de multiplicar es " + i + " x " + numero + "el resultado es " + (numero * i));
                }
            }
        }
        while (numero != 0);{
            System.out.println("Operación terminada");
        }
    }

    public static int pedirNumeroUsuario(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int numeroUsuario = sc.nextInt();
        return numeroUsuario;
    }
}
