package Objetos.recap;

import java.time.LocalDateTime;

public abstract class EventoImpl implements Evento{

    protected String nombre;
    protected LocalDateTime fechaHora;
    protected boolean estaVencido;

    public EventoImpl(String nombre, LocalDateTime fechaHora, boolean estaVencido) {
        this.nombre = nombre;
        this.fechaHora = fechaHora;
        this.estaVencido = estaVencido;
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

    public boolean isEstaVencido() {
        return estaVencido;
    }

    public void setEstaVencido(boolean estaVencido) {
        this.estaVencido = estaVencido;
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
    public void borraEvento() {

    }
}
