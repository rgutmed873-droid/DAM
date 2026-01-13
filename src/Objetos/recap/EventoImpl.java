package Objetos.recap;

import java.time.LocalDateTime;

public abstract class EventoImpl implements Evento{

    protected String nombre;
    protected LocalDateTime fechaHora;


    public EventoImpl(String nombre, LocalDateTime fechaHora) {
        this.nombre = nombre;
        this.fechaHora = fechaHora;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }


    @Override
    public abstract void mostrarInfo();

    @Override
    public void añadirEvento() {

    }

    @Override
    public void modificarEvento() {

    }

    @Override
    public abstract void borraEvento();

    public abstract boolean esFuturo();

}
