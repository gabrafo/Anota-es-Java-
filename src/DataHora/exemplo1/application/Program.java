package DataHora.exemplo1.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Padrão de formatação de data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Padrão de formatação de data-hora

        LocalDate d01 = LocalDate.now(); // Instanciação de um objeto do tipo LocalDate que retorna ao usuário a hora atual em formato ISO
        LocalDateTime d02 = LocalDateTime.now(); //Instanciação de um objeto do tipo LocalDate que retorna ao usuário a data-hora atual em formato ISO
        Instant d03 = Instant.now(); // Data-hora global no GMT de Londres

        LocalDate d04 = LocalDate.parse("2024-03-06"); // Java 17+
        LocalDateTime d05 = LocalDateTime.parse("2024-03-06T01:30:26");
        Instant d06 = Instant.parse("2024-03-06T01:30:26Z"); // Gera no fuso horário londrino
        Instant d07 = Instant.parse("2024-03-06T01:30:26-03:00"); // Gera no fuso horário paulista

        LocalDate d08 = LocalDate.parse("04/04/2005", fmt1); // Transforma de data normal em data ISO
        LocalDateTime d09 = LocalDateTime.parse("03/06/2024 12:00", fmt2); // Transforma de data-hora normal em data-hora ISO

        LocalDate d10 = LocalDate.of(2024, 4, 4); // Ano, mês e dia para ISO
        LocalDateTime d11 = LocalDateTime.of(2024, 4, 4, 1, 30); // Ano, mês, dia, hora e minuto para ISO

        // Implicitamente há uma chamada .toString() após a chamada de cada um dos objetos abaixo na exibição
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
    }
}
