package com.bytebank;

public class Gerente extends Funcionario implements Autenticavel {
    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao(){
        System.out.println("Chamando método de bonificacao gerente");
        return super.getSalario();
    }

    private AutenticacaoUtil autenticador;

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
