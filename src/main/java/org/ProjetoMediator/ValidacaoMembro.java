package org.ProjetoMediator;

public class ValidacaoMembro implements Acesso {

    private static ValidacaoMembro instancia = new ValidacaoMembro();

    private ValidacaoMembro() {}

    public static ValidacaoMembro getInstancia() {
        return instancia;
    }

    @Override
    public String validarMembro(String idMembro) {
        return "Acesso autorizado para o membro: " + idMembro;
    }
}