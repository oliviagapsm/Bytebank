package com.bytebank;

public class Designer extends Funcionario{
    @Override
    public double getBonificacao() {
        System.out.println("Chamando método de bonificacao designer");
        return 200;
    }
}
