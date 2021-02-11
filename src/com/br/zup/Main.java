package com.br.zup;

public class Main {

    public static void main(String[] args) {

        Corretor corretor = new Corretor();

        double lucro = corretor.calcularLucro(new Poupança(), 100);

        System.out.println(lucro);
    }
}
