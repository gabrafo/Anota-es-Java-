package Singleton.exemplo.entities;

public class Pessoa {
    private String nome;
    private String cpf;
    private static Pessoa instance;

    private Pessoa() {}

    public static Pessoa getInstance() {
        if(instance == null) {
            instance = new Pessoa();
        }
        return instance;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
