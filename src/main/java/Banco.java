import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> listaContas;

    public void setListaContas(List<Conta> listaContas) {
        this.listaContas = listaContas;
    }

    public void imprimirContas(){
        System.out.println(getListaContas());
    }
    public String getNome() {
        return nome;
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }


    public String getnome(){
        return nome;
    }
    public void setNome(String nome){

        this.nome = nome;
    }
}
