package Tema6.Medios;

import java.util.Scanner;

public class ejercicio3 {
    static void main(String[] args) {
        /**
         * 3º.- Ejercicio que obtenga todos los múltiplos de un número introducido por el usuario.
         * Se imprimirán todos los múltiplos menores de 100, este será el límite.
         */
        Scanner sc = new Scanner(System.in);
        int numero = pedirNumeroUsuario("Dame el número");

        int numeroMultiplicar;
        int numeroLimite = 100;

        for (int i = 1; i* numero < numeroLimite; i++) {
            numeroMultiplicar = numero * i;
            System.out.println(numeroMultiplicar);
        }
    }

    public static int pedirNumeroUsuario(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int numeroUsuario = sc.nextInt();
        return numeroUsuario;
    }
}
