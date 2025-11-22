package Tema6.Inicial;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        /**
         * 1º.- Realiza un programa que pida al usuario cuatro números enteros, y calcule la suma solo de aquellos números introducidos por el usuario, que sean mayores de 10.
         * Es decir, que si el usuario introduce el 5, el 15, el 6 y el 25, el programa debe calcular la suma solo de 15 más 25, ya que 5 y 6 son menores de 10.
         */
        Scanner sc = new Scanner(System.in);

        int sumaNumeros=0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce el número" + " " + i);
            int num = sc.nextInt();


            if (num > 10){
                sumaNumeros +=num;

            }
        }
        System.out.println("El resultado de la suma es " + sumaNumeros);
    }
}
