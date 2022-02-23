import java.util.List;

public abstract class Conta {

    private static final int AGENCIAPADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIAPADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public void depositar (double valor){
      this.saldo += valor;

     }
    public void sacar(double valor){
        this.saldo -= valor;

    }
    public void transferir(Conta contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Valor transferido de " + cliente.getNome() +
                " para " + contaDestino.cliente.getNome() + " \nValor transferido: " + valor +"R$");
    }

    abstract void extratoConta();


}
