package acoes;

import java.util.Random;

public class Aplicacao {
    private double valorInvestido;
    private double valorFinal;

    public Aplicacao(double valorInvestido) {
        this.valorInvestido = valorInvestido;
        calcularValorFinal();
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    private void calcularValorFinal() {
        // Lógica aleatória simplificada para calcular o valor final da aplicação
        Random random = new Random();
        double taxaDeRendimento = random.nextDouble() * 0.1; // Rendimento entre 0% e 10%
        int anos = random.nextInt(5) + 1; // De 1 a 5 anos
        valorFinal = valorInvestido * (1 + taxaDeRendimento) * anos;
    }
}
