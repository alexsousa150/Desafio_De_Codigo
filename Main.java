import src.Conta;
import src.ContaCorrente;
import src.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.depositar(100);
        poupanca.transferir(100,cc);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
