import java.util.Scanner;

public class Funcions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Elige una opción");
            System.out.println("\n--- Biblioteca de Funciones ---");
            System.out.println("1. ¿Es capicua?");
            System.out.println("2. ¿Es primo?");
            System.out.println("3. Nº de digitos de un entero");
            System.out.println("4. Darle la vuelta a un número entero");
            System.out.println("5. Devolver el digito que esta en la posición n");
            System.out.println("6. Devolver la posición primera de aparición de un digito");
            System.out.println("7. Eliminar un número n de digitos por detras ");
            System.out.println("8. Añadir un dígito a un numero por detras");
            System.out.println("9. Tomar como parametro las posiciones de inicio y fin dentro de un número y devuelve el fragmento correspondiente");
            System.out.println("10. Dos numero que formen uno");

            opcion = sc.nextInt();

            int numero;
            int posicion;
            int digito;
            int digitosAEliminar;
            int posicionInicial;
            int posicionFinal;
            int num1;
            int num2;

            switch (opcion) {
                case 1:
                    System.out.println("Introduce un número ");
                    numero = sc.nextInt();
                    if (numeroCapicua(numero)) {
                        System.out.println("El número es capicua");
                    }else {
                        System.out.println("El número no es capicua");
                    }
                    break;
                case 2:
                    System.out.println("Introduce un numero ");
                    numero = sc.nextInt();
                    if (numeroPrim(numero)){
                        System.out.println("El número es primo");
                    }else {
                        System.out.println("El número no es primo");
                    }
                    break;
                case 3:
                    System.out.println("Introduce un numero ");
                    numero = sc.nextInt();
                    System.out.println("El número de digitos son " + digitos(numero));
                    break;
                case 4:
                    System.out.println("Introduce un numero ");
                    numero = sc.nextInt();
                    System.out.println("El numero invertido es " + darVueltaNumero(numero));
                    break;
                case 5:
                    System.out.println("Introduce un numero ");
                    numero = sc.nextInt();
                    System.out.println("Dime cuantas posiciones lo vas a desplazar");
                    posicion = sc.nextInt();
                    System.out.println("La posición n es: " + devolverDigitos(numero, posicion));
                    break;
                case 6:
                    System.out.println("Introduce un numero ");
                    numero = sc.nextInt();
                    System.out.println("Dime el digito a buscar");
                    digito = sc.nextInt();
                    int posicionEncontrada = posicionDigito(numero,digito);
                    if (posicionEncontrada == -1){
                        System.out.println("El digito no aparece en el número");
                    }else {
                        System.out.println("La primera aparición del digito es en la posición: " + posicionEncontrada);
                    }
                    break;
                case 7:
                    System.out.println("Introduce un numero ");
                    numero = sc.nextInt();
                    System.out.println("Dime la cantidad de digitos a eliminar ");
                    digitosAEliminar = sc.nextInt();
                    System.out.println("Resultado " + digitosEliminar(numero,digitosAEliminar));
                    break;
                case 8:
                    System.out.println("Introduce un numero ");
                    numero = sc.nextInt();
                    System.out.println("Añade un digito");
                    digito = sc.nextInt();
                    System.out.println("El numero es: " + numero + " el digito añadir es: " + digito + " y el resultado es " + añadirDigito(numero,digito));
                    break;
                case 9:
                    System.out.println("Introduce un numero ");
                    numero = sc.nextInt();
                    System.out.println("Posición inicial");
                    posicionInicial = sc.nextInt();
                    System.out.println("Posición final");
                    posicionFinal = sc.nextInt();

                    int fragmento = posiciones(numero,posicionInicial,posicionFinal);
                    System.out.println("El resultado del cambio es " + fragmento);
                    break;
                case 10:
                    System.out.println("Introduce el primer numero ");
                    num1 = sc.nextInt();
                    System.out.println("Introduce el segundo numero");
                    num2 = sc.nextInt();
                    System.out.println("El primer número es " + num1 + " el segundo número es " + num2 + " el resultado de juntarlos es " + juntarNumeros(num1,num2));
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación");
                    break;
            }

        }while (opcion != 0);
    }

    /**
     * Metodo para saber si un número es capicua
     * @param num
     * @return
     */
    private static boolean numeroCapicua(int num) {
        int original = num;
        int revertir = 0;

        while(num != 0) {
            revertir = revertir * 10 + (num % 10);
            num /= 10;
        }
        return original == revertir;

    }

    /**
     * Metodo para determinar si un número es primo
     * @param num
     * @return
     */
    private static boolean numeroPrim(int num) {

        if (num < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo para contar los digitos de un número
     * @param num
     * @return
     */
    private static int digitos(int num){
        int contador = 0;
        while (num > 0){
            num /= 10;
            contador++;
        }
        return contador;
    }

    /**
     * Metodo para darle la vuelta a un número
     * @param num
     * @return
     */
    private static int darVueltaNumero(int num){
        int darVuelta = 0;

        while(num != 0) {
            darVuelta = darVuelta * 10 + (num % 10);
            num /= 10;
        }
        return darVuelta;
    }

    /**
     * Metodo para devolver el digito a una posición
     * @param num
     * @param posicion
     * @return
     */
    private static int devolverDigitos(int num, int posicion){
        String s = String.valueOf(num);
        if (posicion < 0 || posicion >= s.length()){
            return -1;
        }
        return Character.getNumericValue(s.charAt(posicion));
    }

    /**
     * Metodo para devolver la posición primera de aparición de un digito
     * @param numero
     * @param digitoBuscado
     * @return
     */
    private static int posicionDigito(int numero, int digitoBuscado){
        String s = String.valueOf(numero);

        for (int i = 0; i < s.length(); i++) {
            if (Character.getNumericValue(s.charAt(i)) == digitoBuscado){
                return i;
            }
        }
        return -1;
    }

    /**
     * Metodo para eliminar digitos hacia la dereches
     * @param numero
     * @param digitosEliminar
     * @return
     */
    private static int digitosEliminar(int numero,int digitosEliminar){
        //Calculo 10^n
        int divisor = (int) Math.pow(10,digitosEliminar);
        //Compruebo que el divisor es mayor que la cantidad de digitos
        if (divisor > numero){
            return 0;
        }
        //Dividimos el número por 10^n para eliminar los digitos
        return numero / divisor;
    }

    /**
     * Metodo para añadir un digito al numero que se solicita
     * @param numero
     * @param digito
     * @return
     */
    private static int añadirDigito(int numero, int digito){
        numero = numero *10 +digito;
        return numero;
    }

    /**
     * Metodo que pide un numero al usuario y fragmenta el número entre unos parametros
     * @param numero
     * @param inicio
     * @param end
     * @return
     */
    private static int posiciones(int numero, int inicio, int end ){
        String s = String.valueOf(numero);

        if (inicio < 0) inicio = 0;
        if (end > s.length()) end = s.length();
        if (inicio >= end )return 0;

        String fragmento = s.substring(inicio,end);
        return Integer.parseInt(fragmento);
    }

    /**
     * Metodo para juntar dos numeros
     * @param numero
     * @param numero2
     * @return
     */
    private static int juntarNumeros(int numero,int numero2){
        int aux = numero2;
        int digitos = 0;

        if (aux == 0){
            digitos = 1;
        }else {
            while (aux > 0){
                aux /= 10;
                digitos++;
            }
        }

        int total = numero * (int) Math.pow(10,digitos) + numero2;
        return total;
    }

}
