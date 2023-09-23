package acoes;

import java.util.Random;

public class Financiamento {
    private double valorSolicitado;
    private double valorTotal;

    public Financiamento(double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
        calcularValorTotal();
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    private void calcularValorTotal() {
        // Lógica aleatória simplificada para calcular o valor total do financiamento
        Random random = new Random();
        double taxaDeJuros = random.nextDouble() * 0.2; // Taxa de juros entre 0% e 20%
        valorTotal = valorSolicitado * (1 + taxaDeJuros);
    }
}
