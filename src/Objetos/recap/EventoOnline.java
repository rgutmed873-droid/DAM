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
        super(nombre,fechaHora,false);
        this.plataforma = plataforma;
    }


    @Override
    public void mostrarInfo() {
        System.out.println("Evento Online: " + super.nombre);
        System.out.println("Fecha y hora: " + super.fechaHora);
        System.out.println("Plataforma " + this.plataforma);
    }
}
