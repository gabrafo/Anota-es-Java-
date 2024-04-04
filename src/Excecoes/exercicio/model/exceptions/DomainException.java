package Excecoes.exercicio.model.exceptions;

public class DomainException extends RuntimeException{
    private static final long serialVersionUID = 1L; // Versão

    public DomainException(String msg) {
        super(msg);
    }
}