package Tema5.Altos;

import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        /**
         * 1º.- Realiza un ejercicio que califique la nota obtenida por un alumno/a en un examen. El
         * ejercicio pedirá al usuario la nota numérica, y se imprimirá en pantalla su traducción a nota
         * de texto: muy deficiente, insuficiente, suficiente, bien, notable y sobresaliente. Debes
         * realizar el ejercicio a través de una sentencia switch, no de if anidados.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nota");
        int nota = sc.nextInt();

        switch (nota) {
            case 1,2:
                System.out.println("La nota obtenida es muy deficiente");
                break;
            case 3,4:
                System.out.println("La nota obtenida es un deficiente");
                break;
            case 5:
                System.out.println("La nota obtenida es un suficiente");
                break;
            case 6:
                System.out.println("La nota obtenida es un bien");
                break;
            case 7,8:
                System.out.println("La nota obtenida es un notable");
                break;
            case 9,10:
                System.out.println("La nota obtenida es un sobresaliente");
                break;
        }
    }
}
