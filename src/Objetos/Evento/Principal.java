package Objetos.Evento;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Long> usuarios = new HashMap<>();

        usuarios.put("admin",1234L);
        usuarios.put("alumno",1111L);
        usuarios.put("profesor",2222L);

        //LOGIN OBLIGATORIO
        String usuarioLogeado = login(usuarios,sc);
        //DEFINIR METODOS PARA OBTENER DATOS Y

        int opcion;
        do {
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("1. Mostrar eventos");
            System.out.println("2. Gestionar eventos");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                System.out.println("Mostrar eventos");
                break;
                case 2:
                System.out.println("Gestión de eventos");
                break;
                case 0:
                System.out.println("Hasta luego " + usuarioLogeado);
                break;
                default:
                System.out.println("Opción no válida");
            }
        } while (opcion != 0);

    }

    private static void obtenerDatos(){

    }

    private static String login(HashMap<String, Long> usuarios,Scanner sc) {

        String usuario;
        long password;

        while (true){
            System.out.println("Usuario: ");
            usuario = sc.nextLine();

            System.out.println("Contraseña: ");
            password = sc.nextLong();
            sc.nextLine();

            //Comprobar si exite el usuario
            if (usuarios.containsKey(usuario)){
                //Comprobar contraseña
                if (usuarios.get(usuario) == password){
                    System.out.println("Login correcto. Bienvenido," + usuario);
                    return usuario;
                }
            }
            System.out.println("Usuario o contraseña incorrecto.");
        }
    }

}
