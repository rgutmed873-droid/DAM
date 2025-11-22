package Tema6.Alto;

import java.util.Scanner;

public class ejercicio1 {
    static void main(String[] args) {
        /**
         * 1º.- Realiza un ejercicio que pida números al usuario. El programa debe detenerse cuando el
         * usuario introduzca el número 0 (cero), que no debe tenerse en cuenta para ninguna
         * operación aritmética, simplemente para salir de la aplicación. Cuando el programa haya
         * terminado, se debe sacar en pantalla el valor de la suma y de la media de todos los
         * números.
         */
        Scanner sc = new Scanner(System.in);
        int numero = pedirNumeroUsuario("Dame los números necesarios");
        int sumaNumeros = 0;
        int contador = 0;
        double media = 0;
        do {
            sumaNumeros += numero;
            contador++;
            numero = pedirNumeroUsuario("Dame otro número");
            media = sumaNumeros/contador;
            if (contador > 0){
                media = (double) sumaNumeros / contador;
                System.out.println("El resultado de la suma es " + sumaNumeros + " y la media es " + media);
            }else {
                System.out.println("No has introducido ningun número");
            }



        }while (numero != 0);


    }

    public static int pedirNumeroUsuario(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int numeroUsuario = sc.nextInt();
        return numeroUsuario;
    }
}
