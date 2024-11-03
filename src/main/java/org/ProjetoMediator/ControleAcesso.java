package org.ProjetoMediator;

public class ControleAcesso {

    private static ControleAcesso instancia = new ControleAcesso();

    private ControleAcesso() {}

    public static ControleAcesso getInstancia() {
        return instancia;
    }

    public String permitirAcesso(String idMembro) {
        return ValidacaoMembro.getInstancia().validarMembro(idMembro);
    }
}