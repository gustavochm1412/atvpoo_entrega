package contas;

import java.util.ArrayList;
import java.util.List;

import acoes.Transacao;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private List<Transacao> transacoes;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            transacoes.add(new Transacao("Depósito", valor));
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            transacoes.add(new Transacao("Saque", -valor));
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
