package DataHora.exemplo2.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2024-03-06");
        LocalDateTime d05 = LocalDateTime.parse("2024-03-06T01:30:26");
        Instant d06 = Instant.parse("2024-03-06T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // Data-hora
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Objeto de formatação que considera o fuso do computador que tá rodando o programa
        // Instant tem que sempre passar por uma formatação com .withZone()

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // Transforma para o formato ISO (não pode formatar data-horas globais, por ser local)
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " + d04.format(fmt1)); // Formata, na hora da exibição, de ISO para texto personalizado
        System.out.println("d04 = " + fmt1.format(d04)); // Formata, na hora da exibição, de ISO para texto personalizado
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Formata, na hora da exibição, de ISO para texto personalizado excluindo o objeto de formatação logo após a sua utilização

        System.out.println(); // Quebra de linha

        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + d05.format(fmt4));

        System.out.println(); // Quebra de linha

        System.out.println("d06 = " + fmt3.format(d06)); // GMT-03 é 3 horas adiantado ao horário de Londres, por isso a data-hora está completamente mudada
        System.out.println("d06 = " + fmt5.format(d06)); // Instant em formato ISO
        System.out.println("d06 = " + d06); // Instant em formato ISO
    }
}
