import contas.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        // Criar uma conta bancária para um titular
        ContaBancaria conta = new ContaBancaria("João");

        // Realizar operações na conta
        conta.depositar(1000.0);
        conta.sacar(200.0);

        // Exibir saldo
        System.out.println("Saldo da conta de " + conta.getTitular() + ": R$" + conta.getSaldo());
    }
}
