package org.ProjetoMediator;

public abstract class Pessoa {
    public String acessarAcademia(String idMembro) {
        return ControleAcesso.getInstancia().permitirAcesso(idMembro);
    }
}