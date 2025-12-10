package Tema6.Rookie.Medio;

import java.util.Scanner;

public class ejercicio2_medio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el límite inferior: ");
        int limiteInferior = sc.nextInt();
        System.out.print("Introduce el límite superior: ");
        int limiteSuperior = sc.nextInt();

        int numero = limiteInferior;

        while (numero <= limiteSuperior) {
            if (numero < 2) {
                System.out.println(numero + " no es ni primo ni compuesto");
            } else {
                boolean esPrimo = true;
                int divisor = 2;

                // Recorremos posibles divisores sin usar break
                while (divisor * divisor <= numero && esPrimo) {
                    if (numero % divisor == 0) {
                        esPrimo = false;
                    }
                    divisor++;
                }

                System.out.println(numero + " es " + (esPrimo ? "primo" : "compuesto"));
            }
            numero++;
        }

        sc.close();
    }
}
