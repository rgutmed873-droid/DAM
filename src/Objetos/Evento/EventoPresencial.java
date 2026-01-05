package Objetos.Evento;

import java.time.LocalDateTime;

public class EventoPresencial extends Evento{

    //Atributos principales
    String aula;

    /**
     * Constructor para evento presencial
     * @param nombre
     * @param fechaHora
     * @param aula
     */
    public EventoPresencial(String nombre, LocalDateTime fechaHora, String aula) {
        super(nombre, fechaHora);
        this.aula = aula;
    }

    //GETTER
    public String getAula() {
        return aula;
    }
    //SETTER
    public void setAula(String aula) {
        this.aula = aula;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Evento presencial: " + nombre);
        System.out.println("Fecha: " + fechaHora);
        System.out.println("Aula: " + aula);
        System.out.println("Vencido: " + estaVencido);
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
