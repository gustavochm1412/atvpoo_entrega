package contas;

public class ContaPoupanca extends ContaBancaria {
    private static final double SALDO_MINIMO = 50.0;

    public ContaPoupanca(String titular) {
        super(titular);
        super.depositar(SALDO_MINIMO);
    }
}
