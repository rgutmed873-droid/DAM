package Objetos.recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> usuarios = new HashMap<>();

        ArrayList<EventoImpl> eventos = new ArrayList<>();

        cargarUsuarios(usuarios);


        if (loguearse(usuarios)){
            System.out.println("Bienvenido a la aplicación");
            mostrarMenuEvento();
        }else {
            System.out.println("Cerrando a la aplicacion");
            sc.close();
        }


    }

    private static void crearNuevoUsuario(HashMap<String, String> usuarios) {

    }

    private static void listarEventosFuturos(ArrayList<EventoImpl> eventos) {

    }

    private static boolean comprobarNuevaPass(String nuevaPass) throws PasswordException {

        //la contraseña debe cumplir las condicones de 8-12 con letras y simbolos !=?¿
        //Para el git
        String expresionRegular = "[a-zA-Z]{8,12}";
        if(nuevaPass.matches(expresionRegular)){
            return true;
        }else {
            throw new PasswordException("Error en el sistema. Hable con el adminsitrador", TipoErrorPassword.ERROR_PASSWORD_LETRAS);
        }


    }

    private static boolean comprobarUsuario(HashMap<String, String> usuarios, String nuevoUsuario) {

        if(usuarios.containsKey(nuevoUsuario))
            return false;
        return true;
    }

    private static void addUser(HashMap<String, String> usuarios, String nuevoUsuario, String nuevaPass) throws Exception {

        if(nuevoUsuario.equals("admin"))
            throw new Exception("Usuario invalido");

        usuarios.put(nuevoUsuario,nuevaPass);
    }

    private static void eliminarEvento(ArrayList<EventoImpl> eventos) {

        String nombreEventoEliminar = "Tareas Moodle";

        if(eventos.isEmpty())
            System.out.println("Lista de eventos vacia");
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

    private static void mostrarMenuEvento() {
        System.out.println("Bienvenido a la app de EVENTOS: " +
                "\n\t1. Mostrar Eventos"+
                "\n\t2. Mostrar Eventos futuros"+
                "\n\t3. Añadir evento presencial"+
                "\n\t4. Añadir evento online"+
                "\n\t5. Borrar Eventos"+
                "\n\t6. Crear nuevo usuario"+
                "\n\t7. Salir");
    }

    private static void mostrarMenu(ArrayList<EventoImpl> eventos, HashMap<String, String> usuarios) {
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
                case 3:
                    System.out.println("Dime el nombre de usuario");
                    String nuevoUsuario = sc.nextLine();
                    if (!comprobarUsuario(usuarios, nuevoUsuario)){
                        break;
                    }
                    System.out.println("Dime la contraseña del nuevo usuario");
                    String nuevaPass = sc.nextLine();


                    boolean esCorrecta = false;

                    while(esCorrecta){
                        try{
                            esCorrecta = comprobarNuevaPass(nuevaPass);
                            System.out.println("Contraseña correcta");
                        } catch (PasswordException e) {
                            System.out.println(e.getTipoError());
                            System.out.println("Intentalo de nuevo");
                        }

                    }

                    try {
                        if (comprobarNuevaPass(nuevaPass)) {
                            try {
                                addUser(usuarios, nuevoUsuario, nuevaPass);
                            }catch (Exception e){
                                e.getMessage();
                            }
                        }
                    } catch (PasswordException e) {
                        System.out.println(e.getTipoError());
                    }

                    break;
                case 4:
                    break;
                case 5:
                    eliminarEvento(eventos);
                    break;
                case 6:
                    crearNuevoUsuario(usuarios);
                    break;
                case 7:

            }

        }while (opcion != 0);

    }

    private static void cargarUsuarios(HashMap<String, String> usuarios) {
        usuarios.put("admin", "1234");
        usuarios.put("alumno", "2345");
    }

    private static boolean loguearse(HashMap<String, String> usuarios) {

        Scanner sc = new Scanner(System.in);

        int contadorIntentos = 0;

        while (contadorIntentos !=3) {

            System.out.println("Introduce usuario: ");
            String user = sc.nextLine();
            System.out.println("Introduce contraseña: ");
            String pass = sc.nextLine();

            if (usuarios.containsKey(user) && usuarios.get(user).equals(pass)) {
                System.out.println("Login Correcto");
                return true;

            } else {
                System.out.println("Usuario no encontrado");
                contadorIntentos++;
            }

        }

        return false;
    }

}


// METODO PARA COMPROBAR SI ES FUTURO
//        if (!getFechaHora().isBefore(LocalDateTime.now())){
//            return true;
//        }
//
//        return ;


