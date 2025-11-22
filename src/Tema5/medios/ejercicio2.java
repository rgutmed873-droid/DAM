package Tema5.medios;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        /**
         * 2º.- Realiza un ejercicio igual al anterior, pero al acabar, el programa no debe mostrar la
         * suma de los números, sino cuantos han entrado en cada categoría. A esto se llema
         * contadores, a diferencia del ejercicio anterior, que reciben el nombre de acumuladores.
         */
        Scanner sc = new Scanner(System.in);
        int negativos = 0;
        int bajos = 0;
        int medios = 0;
        int grandes = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el número");
            int numero = sc.nextInt();
            if (numero < 0){
                negativos++;
            } else if (numero >=0 && numero<=25) {
                bajos++;
            } else if (numero >=26 && numero<=250) {
                grandes++;
            } else if (numero >250) {
                grandes++;
            }
        }
        System.out.println("El total de número negativos son " + negativos);
        System.out.println("El total de número bajos son " + bajos);
        System.out.println("El total de número medios son " + medios);
        System.out.println("El total de número grandes son " + grandes);
    }
}
