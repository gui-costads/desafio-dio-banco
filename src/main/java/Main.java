public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();

        ContaCorrente cc = new ContaCorrente(cliente);
        ContaPoupança cp = new ContaPoupança(cliente2);

        cliente.setNome("Dio");
        cliente2.setNome("Sportheca");
        cc.depositar(300);
        cp.depositar(100);

        cc.extratoConta();
        cp.extratoConta();


        cc.transferir(cp, 100);
        cc.extratoConta();
        cp.extratoConta();


    }

}
