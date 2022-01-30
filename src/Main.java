public class Main {
    public static void main(String[] args) {
        Cliente jonathan = new Cliente();
        jonathan.setNome("jonathan");

        Conta cc = new ContaCorrente(jonathan);
        Conta poupanca = new ContaPoupanca(jonathan);

        cc.depositar(1000);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
