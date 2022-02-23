public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void extratoConta(){
        System.out.println("\n=====EXTRATO Conta Corrente=====");
        System.out.format("Nome: %s\n", cliente.getNome());
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Numero da conta : %d\n", this.numero);
        System.out.printf("Saldo: %.2f\n", this.saldo);
        System.out.println("=====////////////////=====\n");
    }

}
