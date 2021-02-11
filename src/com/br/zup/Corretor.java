package com.br.zup;

public class Corretor {
    // Poupança 1.9 ao ano
    // IV 0.4 ao ano
    // BL 10.5 ao ano
    // IFF 6.8 ao ano

    public double calcularLucro(Investimento investimento, double montante){
        return investimento.calcularRendimentoInvestido(montante);
    }

}
