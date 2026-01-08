package Objetos.recap;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String,Long> usuarios = new HashMap<>();
        ArrayList<EventoImpl> eventos = new ArrayList<>();

        eventos.add(new EventoOnline("Tareas Moodle", LocalDateTime.now(), "Moodle"));
        eventos.add(new EventoPresencial("Charla", LocalDateTime.now(), "Aula 14"));

        cargarUsuarios(usuarios);

        System.out.println("Introduce el usuario: ");
        String user = sc.nextLine();
        System.out.println("Introduce la contraseña: ");
        long pass = sc.nextLong();

        if (loguearse(user, pass,usuarios)){
            int opcion;
            do {

            if (user.equals("admin"))
                mostrarMenuAdmin();
            else mostrarMenu();


            opcion = sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    mostrarEventos(eventos);
                    break;
                case 2:
                    break;
                case 5:
                    eliminarEvento(eventos);
                    break;
            }

            }while (opcion != 0);
        }else {
            System.out.println("Usuario no encontrado. Salida de la aplicación");
        }

    }

    private static void eliminarEvento(ArrayList<EventoImpl> eventos) {

        String nombreEventoEliminar = "Tareas Moodle";

        if (eventos.isEmpty())
            System.out.println("Lista de eventos vacía");
        else {
            for (int i = 0; i < eventos.size(); i++) {

                if (eventos.get(i).getNombre().equalsIgnoreCase(nombreEventoEliminar))
                    eventos.remove(i);
            }
        }

    }

    private static void mostrarEventos(ArrayList<EventoImpl> eventos) {

        for (EventoImpl e : eventos){
            e.mostrarInfo();
        }

    }

    private static void mostrarMenuAdmin() {
        System.out.println("Bienvenido a la app de EVENTOS:" +
        "\n\t1. Mostrar Eventos "+
        "\n\t2. Añadir Eventos "+
        "\n\t3. Añadir Usuarios "+
        "\n\t4. Borrar Usuarios "+
        "\n\t5. Borrar Eventos ");
    }

    private static void mostrarMenu() {


    }

    private static void cargarUsuarios(HashMap<String, Long> usuarios) {

        usuarios.put("admin", 1234L);
        usuarios.put("alumno", 1111L);
        usuarios.put("profesor", 2222L);
    }

    private static boolean loguearse(String user, Long pass ,HashMap<String,Long> usuarios){

        if (usuarios.containsKey(user)){
            if (usuarios.get(user).equals(pass)){
                System.out.println("Login Correcto");
                return true;
            }else {
                System.out.println("Contraseña incorrecta");
                return false;
            }
        }else {
            return false;
        }
    }


}
