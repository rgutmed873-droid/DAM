package Objetos.recap;

import java.time.LocalDateTime;

public class EventoOnline extends EventoImpl{

    private String plataforma;


    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public EventoOnline (String nombre, LocalDateTime fechaHora, String plataforma){
        super(nombre,fechaHora);
        this.plataforma = plataforma;
    }


    @Override
    public void mostrarInfo() {
        System.out.println("Evento Online: " + super.nombre);
        System.out.println("Fecha y hora: " + super.fechaHora);
        System.out.println("Plataforma " + this.plataforma);
    }

    @Override
    public void borrarEvento() {

    }

    @Override
    public void borraEvento() {

    }

    @Override
    public boolean esFuturo() {
        return false;
    }
}
