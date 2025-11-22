package Tema6.Medios;

import java.util.Scanner;

public class ejercicio4 {
    static void main(String[] args) {
        /**
         * 4º.- Reforma el ejercicio anterior, para que el límite sea también introducido por el usuario.
         */
        Scanner sc = new Scanner(System.in);
        int num = pedirNumeroUsuario("Dame el numero de multiplicar");

        int numeroLimite =  pedirNumeroUsuario("Dame el numero de limite");
        int numeroMultiplicar;

        for (int i = 1; i*num < numeroLimite; i++) {
            numeroMultiplicar = i*num;
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
