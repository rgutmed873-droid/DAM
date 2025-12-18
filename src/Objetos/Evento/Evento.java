package Objetos.Evento;

import java.time.LocalDateTime;

public abstract class Evento implements Metodos{

    //ATRIBUTOS PRINCIPALES
    String nombre;
    LocalDateTime fechaHora;
    boolean estaVencido;

    /**
     * Constructor con atributos
     * @param nombre
     * @param fechaHora
     */
    public Evento(String nombre, LocalDateTime fechaHora) {
        this.nombre = nombre;
        this.fechaHora = fechaHora;
    }

    //GETTERS AND SETTERS
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

}
