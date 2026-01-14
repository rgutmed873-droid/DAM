package Objetos.recap;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventoPresencial extends EventoImpl{

    private String aula;

    // Formateo para la fecha
    private static final DateTimeFormatter formateador =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @Override
    public void mostrarInfo() {
        System.out.println("==== EVENTO PRESENCIAL ===");
        System.out.println("Evento presencial: " + super.nombre);
        System.out.println("Fecha y hora: " + super.fechaHora);
        System.out.println("Aula " + this.aula);

        if (esFuturo()){
            System.out.println("Estado: Evento futuro");
        }else {
            System.out.println("Estado: Evento pasado");

        }
        System.out.println("---------------------");
    }


    @Override
    public boolean esFuturo() {
        return false;
    }

    public EventoPresencial(String nombre, LocalDateTime fechaHora, String aula) {
        super(nombre,fechaHora);
        this.aula = aula;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
}
