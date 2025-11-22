package Tema5.iniciales;

import java.util.Scanner;

public class ejercicio6 {
    static void main(String[] args) {
        /**
         * 6º.- Realizar un ejercicio en Java que pida un número al usuario e indique en pantalla si se
         * trata de un número par o impar. Recuerda que un número par es aquel cuyo resto de su
         * división entre dos sea siempre cero, y recuerda que un número impar es aquel cuyo resto de
         * su división entre dos sea siempre uno.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int numero = sc.nextInt();

        if (numero %2 == 0){
            System.out.println(numero + " " + "es par");
        }else {
            System.out.println(numero + " " + "es impar");
        }
    }
}
