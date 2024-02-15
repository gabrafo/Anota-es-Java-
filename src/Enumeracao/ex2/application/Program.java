package Enumeracao.ex2.application;

import Enumeracao.ex2.entities.Comment;
import Enumeracao.ex2.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Santos FC!");
        Comment c2 = new Comment("O Palmeiras tem ligação com o fascismo italiano");
        Post p1 = new Post(LocalDateTime.parse("04/04/2024 14:40:05", fmt), "Gabriel Sincero Fã Clube",
                "Pessoal obg pelo apoio eu realmente sou muito sincero msm kk - Gabriel", 4445);
        p1.addComment(c1);

        System.out.println(p1);
    }
}
