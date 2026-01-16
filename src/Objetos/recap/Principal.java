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
            System.out.println("BIENVENIDO A LA APLICACION");
            mostrarMenuEvento(eventos, usuarios,usuarioActual);
        }else {
            System.out.println("CERRANDO LA APLICACIÓN");
            sc.close();
        }


    }

    /**
     * Metodo para crear nuevos usuarios. Con este método lo primero de todo es tener una condición if para que el usuario
     * que usando la aplicación no es admin no le dejará acceder a este metodo.
     * Luego solicito el nombre del nuevo usuario y con otro if compruebo si el nuevo usuario ya existe
     * Por último si no existe el usuario a crear solicito una nueva contraseña y tengo un try and catch en el que
     * compruebo que la nueva pass cumple las condiciones, meto al nuevo usuario en el hashmap y compruebo si hay algún error
     * @param usuarios
     * @param usuarioActual
     */
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
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("Usuario no creado");
        }

    }

    /**
     * Metodo para mostrar los eventos futuros es muy similar al método de mostrar todos los eventos solo que este muestra
     * los eventos futuros.
     * @param eventos
     */
    private static void listarEventosFuturos(ArrayList<EventoImpl> eventos) {

        //Mostramos la información
        if (eventos.isEmpty())
            System.out.println("No hay eventos futuros");
        else
            for (EventoImpl ev : eventos) {
                if (ev.esFuturo()) {
                    ev.mostrarInfo();
                }
            }
    }

    /**
     * Metodo para comprobar cuando se crea una nueva contraseña.
     * El primer if lo que hace es comprobar que la contraseña cumple los parametros entre 8 y 12 caracteres y si no
     * lanza un error controlado que muestra un mensaje.
     * El segundo if lo que hace es comprobar que la nueva contraseña coincide con la expresión regular definida
     * El tercer if lo que hace es comprobar que la contraseña no contenga ningun valor número
     * Y el último if comprueba que la contraseña contenga algún simbolo o caracter especial.
     * @param nuevaPass
     * @return
     * @throws PasswordException
     */
    private static boolean comprobarNuevaPass(String nuevaPass) throws PasswordException {


        //La longitud de la contraseña debe tener entre 8 y 12 caracteres
        if (nuevaPass.length() < 8 || nuevaPass.length() >12){
            throw new PasswordException("La longitud tiene que estar entre 8 y 12 caracteres ", TipoErrorPassword.ERROR_PASSWORD_LONGITUD);

        }

        /**
         *El (.) de esta expresión quiere decir que se puede poner cualquier caracter de la (a-zA-Z)
         * El (*) lo que quiere decir es que se puede repetir las veces que hagan falta
         * Por lo tanto el (.*) nos dice que las letras declaradas pueden usarse las veces que queramos o las que definamos
         */
        if (!nuevaPass.matches(".*[a-zA-z].*")){
            throw new PasswordException("La contraseña debe contener un caracter de tipo letra", TipoErrorPassword.ERROR_PASSWORD_LETRAS);
        }

        /**
         *Como la expresión regular anterior hay que declarar el (.*) para que pueda coger cualquier numero de veces
         * Pero en ese caso con el (\\d) lo que queremos expresar es que la contraseña no acepte ningun caracter numérico
         */
        if (nuevaPass.matches(".*\\d.*")){
            throw new PasswordException("La contraseña no puede contener ningún valor numérico", TipoErrorPassword.ERROR_PASSWORD_NUM);
        }
        /**
         * Como en el enunciado o como requisitos para la creación de la contraseña nos pide caracteres especiales:
         * En primer lugar lo que he hecho ha sido poner los (.*) para que puedas poner tanto antes como después los
         * caracteres especiales necesarios y luego en los corchetes poner los diferentes caracteres permitidos para la
         * creación de la contraseña.
         */
        if (!nuevaPass.matches(".*[!@#$%&*].*")){
            throw new PasswordException("La contraseña debe contener un símbolo especial", TipoErrorPassword.ERROR_PASSWORD_SIMBOLOS);

        }

        return true;

    }

    /**
     * Metodo para eliminar los eventos que se creen.
     * En primer lugar se comprueba la lista de evento que principalmente estará borrada luego con el bucle for
     * recorro todos los eventos que haya e imprimo por pantalla los evento que hay y sus nombres para así poder borrarlos
     * Luego pido el nombre del evento para borrar y he hecho otro bucle for con un if que obtenga el evento por el nombre
     * y anterior mente he hecho una variable de encontrado que sería false ya que al principio no tendría ningún valor y
     * si envuentra el evento a eliminar se convierte el evento y lo imprimo por pantalla
     * Por último hay una condición if por si no se ha encontrado el evento a eliminar
     * @param eventos
     */
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
                System.out.println("Evento " + nombreEventoEliminar + " " + "eliminado");
                break;
            }

        }
        if (!encontrado){
            System.out.println("Evento" + nombreEventoEliminar + " " + "no encontrado");
        }

        System.out.println("Quedan " + eventos.size() + " en la lista de los eventos");

    }


    /**
     * Metodo para que muestre los eventos que hay.
     * En primer lugar con la condición if compruebo que no haya eventos creados y en el else si hay evento creados
     * recorro con el bucle for e la clase padre y que recorra el arraylist de los eventos y su información así como los
     * eventos que hay.
     * @param eventos
     */
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

    /**
     * Metodo que muestra al usuario las diferentes opciones que tiene para elegir en la aplicación
     * Aquí solo se ha hecho un do/while en el que haga el menú y lleve a los diferentes metodos y muestre el menú.
     * @param eventos
     * @param usuarios
     * @param usuarioActual
     */
    private static void mostrarMenuEvento(ArrayList<EventoImpl> eventos, HashMap<String, String> usuarios, String usuarioActual) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        do{
            System.out.println("GESTOR DE EVENTOS: " +
                    "\n\t Usuario actual: " + usuarioActual +
                    "\n\t1. Mostrar Eventos"+
                    "\n\t2. Mostrar Eventos futuros"+
                    "\n\t3. Añadir evento presencial"+
                    "\n\t4. Añadir evento online"+
                    "\n\t5. Borrar Eventos"+
                    "\n\t6. Crear nuevo usuario (Solo admin)"+
                    "\n\t7. Salir"+
                    "\n\t Seleccione una opción (1-7):");

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

    /**
     * Metodo para crear eventos en este caso online en el que he implementado un try and catch en el que lo primero
     * solicito el nombre del evento y luego compruebo con un bucle for que el nuevo evento creado no exista ya por el nombre
     * también se solicita los datos de las fecha uno por uno en el que luego creo un LocalDataTime en el que se muestre
     * los datos que se le solicita al usuario al igual que el sitio de la reunión.
     * Por último tengo dos catch en el que atrape las dos excepciones que he implementado:
     * Una es por si el formato de la fecha esta erroneo y otro por si hay un error inesperado y lo muestre
     * @param eventos
     */
    private static void añadirEventoOnline(ArrayList<EventoImpl> eventos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== AÑADIR EVENTO ONLINE ===");

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
            //2. Pedir todos los datos de fecha y hora
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

            //Crear localdatetime para que muestre las variables que se han creado antes
            LocalDateTime fechaHora = LocalDateTime.of(año,mes,dia,hora,minuto);

            //3.Pedir plataforma
            System.out.println("Plataforma:");
            String plataforma = sc.nextLine();

            //4.Crear evento online
            EventoOnline nuevoEvento = new EventoOnline(nombre,fechaHora,plataforma);

            //5.Añadir a la lista de eventos para luego su revisión y se guarden
            eventos.add(nuevoEvento);

            System.out.println("\n Evento online creado correctamente");
            System.out.println("Total de eventos: " + eventos.size());

        } catch (NumberFormatException e){
            System.out.println("Error: Debe ingresar números válidos para la fecha/hora");

        } catch (Exception e){
            System.out.println("Error inesperado: " + e.getMessage());
        }

    }

    /**
     * Metodo para crear eventos en este caso presenciales en el que he implementado un try and catch en el que lo primero
     * solicito el nombre del evento y luego compruebo con un bucle for que el nuevo evento creado no exista ya por el nombre
     * También se solicita los datos de las fecha uno por uno en el que luego creo un LocalDataTime en el que se muestre
     * los datos que se le solicita al usuario al igual que el sitio de la reunión.
     * Por último tengo dos catch en el que atrape las dos excepciones que he implementado:
     * Una es por si el formato de la fecha esta erroneo y otro por si hay un error inesperado y lo muestre
     * @param eventos
     */
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
            //2. Pedir todos los datos de fecha y hora
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

            //Crear localdatetime para que muestre las variables que se han creado antes
            LocalDateTime fechaHora = LocalDateTime.of(año,mes,dia,hora,minuto);

            //3.Pedir aula
            System.out.println("Aula:");
            String aula = sc.nextLine();

            //4.Crear evento
            EventoPresencial nuevoEvento = new EventoPresencial(nombre,fechaHora,aula);

            //5.Añadir a la lista para luego su revisión y se guarden
            eventos.add(nuevoEvento);

            System.out.println("\n Evento presencial creado correctamente");
            System.out.println("Total de eventos: " + eventos.size());

        } catch (NumberFormatException e){
            System.out.println("Error: Debe ingresar números válidos para la fecha/hora");

        } catch (Exception e){
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    /**
     * Metodo para guardar y cargar los diferentes usuarios que pueden acceder a la aplicación
     * @param usuarios
     */
    private static void cargarUsuarios(HashMap<String, String> usuarios) {
        usuarios.put("admin", "Admin@#$");
        usuarios.put("alumno", "Alumno@!$");
    }

    /**
     * Metodo para comprobar el login de los usuarios registrados a la aplicación
     * Primero tengo puesto un contador de intentos para que si el usuario no pone correctamente el numero de veces de
     * intentos la aplicación devuelve que no encuentra el usuario y se cierra.
     * También una vez que es correcta comprueba que la variable de user está dentro de Hashmap de usuarios y si es correcto
     * Inicia el login correctamente
     * @param usuarios
     * @return
     */
    private static String loguearse(HashMap<String, String> usuarios) {

        Scanner sc = new Scanner(System.in);

        int contadorIntentos = 0;

        while (contadorIntentos !=3) {
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

