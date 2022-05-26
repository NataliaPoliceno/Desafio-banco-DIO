public class Main {
    public static void main (String[]args){
        Cliente cliente = new Cliente();
        cliente.setNome("Naty");
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        System.out.println();

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }


}
