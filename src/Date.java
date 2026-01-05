import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Date {
    public static void main(String[] args) {
        // 1 Fecha dentro de X semanas desde hoy
        int semanas = 3;
        LocalDate hoy = LocalDate.now();
        System.out.println("1) Fecha en " + semanas + " semanas: " + hoy.plusWeeks(semanas));

        // 2 Año anterior y posterior
        int year = 2024;
        System.out.println("2) Año anterior: " + (year - 1));
        System.out.println("   Año posterior: " + (year + 1));

        // 3 Horas, minutos y segundos antes de ahora
        LocalTime ahora = LocalTime.now();
        System.out.println("3) Hora antes: " + ahora.minusHours(1).minusMinutes(30).minusSeconds(10));

        // 4 Horas que faltan para terminar el curso
        LocalDateTime finCurso = LocalDateTime.of(2026, 6, 30, 14, 0);
        long horasCurso = ChronoUnit.HOURS.between(LocalDateTime.now(), finCurso);
        System.out.println("4) Horas para terminar el curso: " + horasCurso);

        // 5 Semanas hasta la Feria de Córdoba 2026
        LocalDate feria = LocalDate.of(2026, 5, 18);
        long semanasFeria = ChronoUnit.WEEKS.between(hoy, feria);
        System.out.println("5) Semanas hasta la Feria de Córdoba: " + semanasFeria);

        // 6 Años hasta el cometa Halley
        LocalDate halley = LocalDate.of(2061, 7, 28);
        long añosHalley = ChronoUnit.YEARS.between(hoy, halley);
        System.out.println("6) Años hasta el cometa Halley: " + añosHalley);

        // 7 Meses y días hasta final de año
        LocalDate finAño = LocalDate.of(hoy.getYear(), 12, 31);
        Period periodo = Period.between(hoy, finAño);
        System.out.println("7) Meses restantes: " + periodo.getMonths());
        System.out.println("   Días restantes: " + periodo.getDays());

        // 8 Mostrar fecha 01/02/2024 con formato
        LocalDate fechaFormateada = LocalDate.of(2024, 2, 1);
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("8) Fecha formateada: " + fechaFormateada.format(formatoFecha));

        // 9 Comprobar si 2022 es bisiesto
        boolean bisiesto = LocalDate.of(2022, 1, 1).isLeapYear();
        System.out.println("9) ¿2022 es bisiesto?: " + bisiesto);

        // 10 Horas entre dos horas
        LocalTime t1 = LocalTime.of(10, 0);
        LocalTime t2 = LocalTime.of(18, 30);
        long horasEntreHoras = Duration.between(t1, t2).toHours();
        System.out.println("10) Horas entre horas: " + horasEntreHoras);

        // 11 Horas entre dos fechas
        LocalDateTime f1 = LocalDateTime.of(2024, 1, 1, 10, 0);
        LocalDateTime f2 = LocalDateTime.of(2024, 1, 2, 10, 0);
        long horasEntreFechas = ChronoUnit.HOURS.between(f1, f2);
        System.out.println("11) Horas entre fechas: " + horasEntreFechas);

        // 12️ Día de la semana de una fecha
        LocalDate diaSemana = LocalDate.of(2024, 2, 1);
        System.out.println("12) Día de la semana: " + diaSemana.getDayOfWeek());

        // 13 Segundos entre 16:04 y 18:07
        LocalTime h1 = LocalTime.of(16, 4);
        LocalTime h2 = LocalTime.of(18, 7);
        long segundos = Duration.between(h1, h2).getSeconds();
        System.out.println("13) Segundos entre horas: " + segundos);

        // 14 Fecha de muerte de Galileo en español
        LocalDate galileo = LocalDate.of(1642, 1, 8);
        DateTimeFormatter formatoEsp = DateTimeFormatter
                .ofPattern("EEEE, d 'de' MMMM 'de' yyyy")
                .withLocale(new Locale("es", "ES"));
        System.out.println("14) Galileo murió el: " + galileo.format(formatoEsp));

        // 15 Lanzamiento de la PS5 en español
        LocalDateTime ps5 = LocalDateTime.of(2020, 11, 19, 0, 1);
        DateTimeFormatter formatoPS5 = DateTimeFormatter
                .ofPattern("dd/MM/yy HH:mm")
                .withLocale(new Locale("es", "ES"));
        System.out.println("15) Lanzamiento PS5: " + ps5.format(formatoPS5));

    }
}
