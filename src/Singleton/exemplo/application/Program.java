package Singleton.exemplo.application;

import Singleton.exemplo.entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Pessoa pessoa = Pessoa.getInstance();
        Pessoa pessoa2 = Pessoa.getInstance();

        pessoa2.setNome("Carlinhos");

        System.out.println(pessoa.getNome());
    }
}