package Tema5.medios;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        /**
         * 1º.- Realiza un ejercicio que acumule cinco números introducidos por el usuario, es decir, que
         * sume las cantidades introducidas, pero realizando cuatro categorías: números negativos,
         * números bajos (entre 0 y 25, ambos inclusive), números medios (entre 26 y 250, ambos
         * inclusie) y números grandes (mayores de 250). Al finalizar el programa, se debe mostrar el
         * total de las sumas de los números introducidos en cada una de las categorías.
         */
        Scanner sc = new  Scanner(System.in);

        int negativos = 0;
        int bajos = 0;
        int medios = 0;
        int grandes = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el número");
            int numero = sc.nextInt();
            if (numero < 0){
                negativos +=numero;
            } else if (numero >=0 && numero <=25) {
                bajos +=numero;
            } else if (numero >=26 && numero <=250) {
                medios +=numero;
            } else if (numero > 250){
                grandes +=numero;
            }
        }

        System.out.println("La suma de negativos son " + negativos);
        System.out.println("La suma de bajos son " + bajos);
        System.out.println("La suma de medios son " + medios);
        System.out.println("La suma de grandes son " + grandes);
    }
}
