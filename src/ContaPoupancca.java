public class ContaPoupancca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("extrato conta poupança");;
        super.imprimirInfosComuns();
    }
    
}