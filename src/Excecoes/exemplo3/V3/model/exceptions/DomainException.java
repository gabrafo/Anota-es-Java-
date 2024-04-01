package Excecoes.exemplo3.V3.model.exceptions;
// Erro lançado na entidade de domínio

// Exception faz com que a classe abaixo seja serializable

public class DomainException extends Exception{ // Pode ser extensão de Exception (compilador obriga a tratar)
    // e de RuntimeException (compilador não obriga a tratar), se não houver um catch para a Runtime o programa quebra

    private static final long serialVersionUID = 1L; // Tipo serializable precisa de uma versão e é assim que se declara (1L é o valor padrão)

    public DomainException(String msg) {
        super(msg);
    }
}
