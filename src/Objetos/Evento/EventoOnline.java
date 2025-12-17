package Objetos.Evento;

import java.time.LocalDateTime;

public class EventoOnline extends Evento{

    //Atributos principales
    String plataforma;

    /**
     * Constructor para evento online
     * @param nombre
     * @param fechaHora
     * @param plataforma
     */
    public EventoOnline(String nombre, LocalDateTime fechaHora, String plataforma) {
        super(nombre, fechaHora);
        this.plataforma = plataforma;
    }

    //GETTER
    public String getPlataforma() {
        return plataforma;
    }
    //SETTER
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }


    @Override
    public void mostrarInfo() {

    }

    @Override
    public void añadirEvento() {

    }

    @Override
    public void modificarEvento() {

    }

    @Override
    public void borraEvento() {

    }
}
