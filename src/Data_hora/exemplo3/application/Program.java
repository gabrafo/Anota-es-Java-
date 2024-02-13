package Data_hora.exemplo3.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2024-03-06");
        LocalDateTime d05 = LocalDateTime.parse("2024-03-06T01:30:26");
        Instant d06 = Instant.parse("2024-03-06T01:30:26Z"); // Dia, mês, hora

        // Converter data-hora global para local
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // Converte o Instant (data global) em data local do PC
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // Converte para o timezone de Portugal
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); // Converte data/hora para local do PC
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        // Obter dados de uma data-hora local
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());
    }
}
