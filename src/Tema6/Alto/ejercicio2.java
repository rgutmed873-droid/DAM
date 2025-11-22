package Tema6.Alto;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {
        /**
         * 2º.- Realiza un ejercicio que pida números al usuario hasta que este introduzca el 0 (cero). Al
         * finalizar el ejercicio se debe imprimir en pantalla el valor mayor y el menor introducido. El
         * valor 0 (cero) no debe tenerse en cuenta.
         */
        Scanner sc = new Scanner(System.in);
        int numero = pedirNumeroUsuario("Introduce un numero distinto de 0");
        int mayor = numero;
        int menor = numero;

        while (numero != 0){

            if (numero > mayor){
                mayor = numero;

            }
            if (numero < menor){
                menor = numero;
            }
            System.out.println("Introduce otro numero (0 termina)");
            numero = sc.nextInt();
        }
        System.out.println("El número mayor es " + mayor);
        System.out.println("El número menor es " + menor);
    }

    public static int pedirNumeroUsuario(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int numero = sc.nextInt();
        return numero;
    }
}
