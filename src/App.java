public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupancca();
        cc.depositar(100.0);
        cc.transferir(10.0, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
