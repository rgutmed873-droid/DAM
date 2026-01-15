package Objetos.recap;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> usuarios = new HashMap<>();

        ArrayList<EventoImpl> eventos = new ArrayList<>();

        cargarUsuarios(usuarios);
        String usuarioActual = loguearse(usuarios);

        if (usuarioActual != null){
            System.out.println("Bienvenido a la aplicación");
            mostrarMenuEvento(eventos, usuarios,usuarioActual);
        }else {
            System.out.println("Cerrando a la aplicacion");
            sc.close();
        }


    }

    private static void crearNuevoUsuario(HashMap<String, String> usuarios, String usuarioActual) {
        Scanner sc = new Scanner(System.in);

        //Varificar si es admin el usuario
        if (!"admin".equals(usuarioActual)) {
            System.out.println("Acceso denegado: Solo el admin puede crear usuarios");
            return;
        }

        //Pedir nuevo usuario
        System.out.println("Introduce el nuevo usuario: ");
        String nuevoUsuario = sc.nextLine();

        //Comprobar que nuevo usuario
        if(usuarios.containsKey(nuevoUsuario)){
            System.out.println("El usuario ya existe");
            return;
        }

        System.out.println("Introduce la contraseña");
        String nuevaPass = sc.nextLine();

        try {
            comprobarNuevaPass(nuevaPass);
            usuarios.put(nuevoUsuario,nuevaPass);
            System.out.println("Usuario correctamente");
        }catch (PasswordException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("Usuario no creado");
        }
    }

    private static void listarEventosFuturos(ArrayList<EventoImpl> eventos) {
        //Mostramos la información
        if (eventos.isEmpty())
            System.out.println("No hay eventos futuros");
        else
            for (EventoImpl ev : eventos){
                if (ev.esFuturo()){
                    ev.mostrarInfo();
                }
            }
    }

    private static boolean comprobarNuevaPass(String nuevaPass) throws PasswordException {

        //la contraseña debe cumplir las condicones de 8-12 con letras y simbolos !=?¿
        //La longitud de la contraseña debe tener entre 8 y 12 caracteres
        if (nuevaPass.length() < 8 || nuevaPass.length() >12){
            throw new PasswordException("La contraseña debe tener entre 8 y 12 caracteres");

        }
        /**
         *
         */
        if (!nuevaPass.matches(".*[a-zA-z].*")){
            throw new PasswordException("La contraseña debe contener letras");
        }
        /**
         *
         */
        if (nuevaPass.matches(".*\\d.*")){
            throw new PasswordException("La contraseña NO puede tener numeros");
        }

        if (!nuevaPass.matches("-*[!@#$%&*].*")){
            throw new PasswordException("La contraseña debe contener al menos un símbolo (!@#$%&*)");

        }

        return true;

    }


    private static void eliminarEvento(ArrayList<EventoImpl> eventos) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n BORRAR EVENTO");

        if(eventos.isEmpty()) {
            System.out.println("Lista de eventos vacia");
            return;
        }
        //Mostrar que eventos hay
        System.out.println("Eventos disponibles:");
        for (int i = 0; i < eventos.size(); i++) {
            System.out.println("-" + eventos.get(i).getNombre());

        }
        //Pedir el nombre para borrar el evento
        System.out.println("\n Nombre del evento a eliminar");
        String nombreEventoEliminar = sc.nextLine();

        //Buscar y borrar
        boolean encontrado = false;

        for (int i = 0; i < eventos.size(); i++) {
            if (eventos.get(i).getNombre().equalsIgnoreCase(nombreEventoEliminar)){
                eventos.remove(i);
                encontrado = true;
                System.out.println("Evento " + nombreEventoEliminar + "eliminado");
                break;
            }

        }
        if (!encontrado){
            System.out.println("Evento" + nombreEventoEliminar + "no encontrado");
        }

        System.out.println("Quedan " + eventos.size() + " en la lista de los eventos");

    }



    private static void mostrarEventos(ArrayList<EventoImpl> eventos) {

        if (eventos.isEmpty()){
            System.out.println("No hay eventos");
        }else{
            for (EventoImpl e : eventos){
                e.mostrarInfo();
                System.out.println(e);
            }
        }

    }

    private static void mostrarMenuEvento(ArrayList<EventoImpl> eventos, HashMap<String, String> usuarios, String usuarioActual) {
        System.out.println("Bienvenido a la app de EVENTOS: " +
                "\n\t Usuario actual: " + usuarioActual +
                "\n\t1. Mostrar Eventos"+
                "\n\t2. Mostrar Eventos futuros"+
                "\n\t3. Añadir evento presencial"+
                "\n\t4. Añadir evento online"+
                "\n\t5. Borrar Eventos"+
                "\n\t6. Crear nuevo usuario"+
                "\n\t7. Salir"+
                "\n\t Seleccione una opción (1-7):");

        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        do{

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    mostrarEventos(eventos);
                    break;
                case 2:
                    listarEventosFuturos(eventos);
                    break;
                case 3:
                    añadirEventoPresencial(eventos);
                    break;
                case 4:
                    añadirEventoOnline(eventos);
                    break;
                case 5:
                    eliminarEvento(eventos);
                    break;
                case 6:
                    crearNuevoUsuario(usuarios, usuarioActual);
                    break;
                case 7:
                    System.out.println("Saliendo de la aplicación");
                    sc.close();
                break;
            }

        }while (opcion != 7);
    }

    private static void añadirEventoOnline(ArrayList<EventoImpl> eventos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n[CREAR EVENTO ONLINE]");

        // Solo lo diferente al presencial:
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Plataforma: ");
        String plataforma = sc.nextLine();  // ← Esto es lo NUEVO

        // La fecha es igual para ambos tipos
        System.out.print("Día (ej: 15): ");
        int dia = Integer.parseInt(sc.nextLine());

        System.out.print("Mes (1-12): ");
        int mes = Integer.parseInt(sc.nextLine());

        System.out.print("Hora (0-23): ");
        int hora = Integer.parseInt(sc.nextLine());

        // Crear
        LocalDateTime fecha = LocalDateTime.of(2024, mes, dia, hora, 0);
        EventoOnline evento = new EventoOnline(nombre, fecha, plataforma);
        eventos.add(evento);

    }

    private static void añadirEventoPresencial(ArrayList<EventoImpl> eventos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== AÑADIR EVENTO PRESENCIAL ===");

        try {
            //1.Pedir nombre evento
            System.out.println("Nombre del evento");
            String nombre = sc.nextLine();

            //Verificar si ya existe un evento con ese nombre
            for (EventoImpl evento : eventos){
                if (evento.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("Ya existe un evento con ese nombre");
                    return;
                }
            }
            //2. Pedir fecha y hora
            System.out.println("\n-- Fecha y hora del Evento");

            System.out.println("Año");
            int año = Integer.parseInt(sc.nextLine());

            System.out.println("Mes");
            int mes = Integer.parseInt(sc.nextLine());

            System.out.println("Día");
            int dia = Integer.parseInt(sc.nextLine());

            System.out.println("Hora");
            int hora = Integer.parseInt(sc.nextLine());

            System.out.println("Minuto");
            int minuto = Integer.parseInt(sc.nextLine());

            //Crear localdatetime
            LocalDateTime fechaHora = LocalDateTime.of(año,mes,dia,hora,minuto);

            //3.Pedir aula
            System.out.println("Aula:");
            String aula = sc.nextLine();

            //4.Crear evento
            EventoPresencial nuevoEvento = new EventoPresencial(nombre,fechaHora,aula);

            //5.Añadir a la lista
            eventos.add(nuevoEvento);

            System.out.println("\n Evento presencial creado correctamente");
            System.out.println("Total de eventos: " + eventos.size());

        } catch (NumberFormatException e){
            System.out.println("Error: Debe ingresar números válidos para la fecha/hora");

        } catch (Exception e){
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }


    private static void cargarUsuarios(HashMap<String, String> usuarios) {
        usuarios.put("admin", "Admin$#@");
        usuarios.put("alumno", "Alumno@!$");
    }

    private static String loguearse(HashMap<String, String> usuarios) {

        Scanner sc = new Scanner(System.in);

        int contadorIntentos = 0;

        while (contadorIntentos !=3) {
            System.out.println("=== BIENVENIDO ===");
            System.out.println("Introduce el usuario: ");
            String user = sc.nextLine();
            System.out.println("Introduce la contraseña: ");
            String pass = sc.nextLine();

            if (usuarios.containsKey(user) && usuarios.get(user).equals(pass)) {
                System.out.println("Login Correcto");
                return user;

            } else {
                System.out.println("Usuario no encontrado");
                contadorIntentos++;
            }

        }

        return null;
    }

}

