public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Cliente cliente2 = new Cliente();

        Banco banco = new Banco();
        banco.getListaContas();

        ContaCorrente cc = new ContaCorrente(cliente);
        ContaPoupança cp = new ContaPoupança(cliente2);


        cc.depositar(100);
        cp.depositar(100);
        cc.transferir(cp, 100);
        cc.extratoConta();
        cp.extratoConta();


    }

}
