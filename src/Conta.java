package src;

public abstract class Conta implements IConta {
    private static int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 0001;
    protected int agencia;
    protected int conta;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }
    @Override
    public void depositar(double valor) {
        saldo +=valor;

    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Conta: %d", conta));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }



}
