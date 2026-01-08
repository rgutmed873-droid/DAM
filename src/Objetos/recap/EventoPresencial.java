package Objetos.recap;

import java.time.LocalDateTime;

public class EventoPresencial extends EventoImpl{

    private String aula;

    @Override
    public void mostrarInfo() {
        System.out.println("Evento presencial: " + super.nombre);
        System.out.println("Fecha y hora: " + super.fechaHora);
        System.out.println("Aula " + this.aula);
    }

    public EventoPresencial(String nombre, LocalDateTime fechaHora, String aula) {
        super(nombre,fechaHora, false);

        this.aula = aula;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
}
