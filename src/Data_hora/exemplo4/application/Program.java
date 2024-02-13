package Data_hora.exemplo4.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2024-03-06");
        LocalDateTime d05 = LocalDateTime.parse("2024-03-06T01:30:26");
        Instant d06 = Instant.parse("2024-03-06T01:30:26Z"); // Dia, mês, hora

        
    }
}
