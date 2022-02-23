import java.math.BigDecimal;

public class ContaPoupança extends Conta {
    private static double TAXA_REFERENCIA = 10.75; //10%

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    public void extratoConta(){

        double rendimento = this.saldo * (1+TAXA_REFERENCIA/100);

        System.out.println("\n=====EXTRATO Conta Poupança=====");
        System.out.printf("Nome: %s\n", cliente.getNome());
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Numero da conta : %d\n", this.numero);
        System.out.printf("Saldo: %.2f\n", this.saldo);
        System.out.printf("Rentabilidade mensal com saldo atual = %.2f\n", rendimento);

        System.out.println("=====////////////////=====");
    }



}