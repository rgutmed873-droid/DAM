package Objetos.Evento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import Objetos.Evento.*;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1️⃣ Usuarios
        HashMap<String, Long> usuarios = new HashMap<>();
        usuarios.put("admin", 1234L);
        usuarios.put("alumno", 1111L);
        usuarios.put("profesor", 2222L);

        // 2️⃣ Login obligatorio
        String usuarioLogueado = login(usuarios, sc);

        // 3️⃣ Estructuras para eventos
        Evento[] eventosArray = new Evento[10]; // array fijo
        ArrayList<Evento> eventosList = new ArrayList<>(); // lista dinámica

        int opcion;
        do {
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("1. Mostrar eventos");
            System.out.println("2. Gestionar eventos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n--- EVENTOS EN ARRAYLIST ---");
                    for (Evento e : eventosList) {
                        e.mostrarInfo();
                        System.out.println("---------------------------");
                    }
                    break;
                case 2:
                    System.out.println("\nGestionar eventos");
                    System.out.println("1. Añadir Evento Presencial");
                    System.out.println("2. Añadir Evento Online");
                    System.out.print("Opción: ");
                    int sub = sc.nextInt();
                    sc.nextLine(); // limpiar buffer
                    if(sub == 1) {
                        System.out.print("Nombre del evento: ");
                        String nombre = sc.nextLine();
                        System.out.print("Fecha y hora (aaaa-mm-ddTHH:MM): ");
                        String fechaStr = sc.nextLine();
                        LocalDateTime fecha = LocalDateTime.parse(fechaStr);
                        System.out.print("Aula: ");
                        String aula = sc.nextLine();
                        EventoPresencial ep = new EventoPresencial(nombre, fecha, aula);
                        eventosList.add(ep);
                        System.out.println("Evento presencial añadido!");
                    } else if(sub == 2) {
                        System.out.print("Nombre del evento: ");
                        String nombre = sc.nextLine();
                        System.out.print("Fecha y hora (aaaa-mm-ddTHH:MM): ");
                        String fechaStr = sc.nextLine();
                        LocalDateTime fecha = LocalDateTime.parse(fechaStr);
                        System.out.print("Plataforma: ");
                        String plataforma = sc.nextLine();
                        EventoOnline eo = new EventoOnline(nombre, fecha, plataforma);
                        eventosList.add(eo);
                        System.out.println("Evento online añadido!");
                    }
                    break;
                case 0:
                    System.out.println("Hasta luego, " + usuarioLogueado);
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        sc.close();
    }

    // MÉTODO LOGIN
    private static String login(HashMap<String, Long> usuarios, Scanner sc) {
        String usuario;
        long password;

        while(true) {
            System.out.print("Usuario: ");
            usuario = sc.nextLine();

            System.out.print("Contraseña: ");
            password = sc.nextLong();
            sc.nextLine(); // limpiar buffer

            if(usuarios.containsKey(usuario) && usuarios.get(usuario) == password) {
                System.out.println("Login correcto. Bienvenido, " + usuario);
                return usuario;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
            }
        }
    }
}
