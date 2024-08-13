package br.com.jadielycardoso.gestao_vagas.exception;

public class JobNotFoundException extends RuntimeException {

    public JobNotFoundException() {
        super("Vaga não encontrada");
    }
}
