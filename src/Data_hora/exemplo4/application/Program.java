package Data_hora.exemplo4.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        // OPERAÇÃO COM DATA-HORAS
        LocalDate d04 = LocalDate.parse("2024-03-06");
        LocalDateTime d05 = LocalDateTime.parse("2024-03-06T01:30:26");
        Instant d06 = Instant.parse("2024-03-06T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusWeeks(1); // Subtrai 1 semana da data d04
        LocalDate nextWeekLocalDate = d04.plusWeeks(1);

        System.out.println("Ano-Mês-Dia");
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);

        System.out.println("Ano-Mês-Dia-T-Hora-Minuto-Segundo");
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // Subtrai 1 semana da data d04
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Ano-Mês-Dia-T-Hora-Minuto-Segundo-Timezone");
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // DURAÇÃO ENTRE DUAS DATA-HORAS
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()); // Tem que converter para LocalDateTime para descobrir a duração
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05); // Período de duração entre d05 -1 semana e d05
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}
