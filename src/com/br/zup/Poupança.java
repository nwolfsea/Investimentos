package com.br.zup;

public class Poupança implements Investimento {
    private double rendimento = 1.9;

    public Poupança() {
    }

    public double getRendimento() {
        return rendimento;
    }

    @Override
    public double calcularRendimentoInvestido(double valorAInvestir) {
        return valorAInvestir * rendimento/100;
    }
}
