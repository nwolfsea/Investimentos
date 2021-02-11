package com.br.zup;

public class IV implements Investimento {
    private double ivRendimento = 0.4;
    private double imposto = 0.2;

    public IV(){

    }

    public double getIvRendimento() {
        return ivRendimento;
    }

    @Override
    public double calcularRendimentoInvestido(double valorAInvestir) {
        double resultado = valorAInvestir * ivRendimento;
        double imposto = resultado * this.imposto/100;
        return resultado - imposto;
    }
}
