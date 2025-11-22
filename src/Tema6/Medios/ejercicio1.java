package Tema6.Medios;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        /**
         * 1º.- Media de una cantidad de números introducidos por el usuario.Al usuario especificará una cantidad
         * de números, tras lo cual se le deben pedir tantos como este haya indicado.
         * Al final se debe imprimir la media.
         */

        Scanner sc = new Scanner(System.in);
        int num = pedirNumeroUsuario("Dime cuantos número vas a introducir");
        int media = 0;
        int sumaNumeros = 0;
        for (int i = 0; i <num; i++) {
            System.out.println("Introduce los números " + i);
            int numero = sc.nextInt();
            sumaNumeros += numero;
            media = sumaNumeros / num;
        }

        System.out.println("La media es: " + media);

    }

    public static int pedirNumeroUsuario(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int numero = sc.nextInt();
        return numero;
    }
}
