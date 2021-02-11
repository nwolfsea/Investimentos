package com.br.zup;

/**
 * Interface que obriga todos as classes que implementarem ela
 * a adicionar o metodo calcularRendimentoInvestido na classe.
 *
 * Interfaces não são intanciaveis.
 * Interfaces servem para padronizar as classes como se fosem contratos de funcionamento
 * @author Vinicius Raymundo
 */
public interface Investimento {

    /**
     * os metodos das interfaces são apenas a ASSINATURA DO METODO, não colocamos o processamento nele.
     * @param valorAInvestir
     * @return
     */
    public double calcularRendimentoInvestido(double valorAInvestir);
}
