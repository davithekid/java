package studying.JavaCore.Enumeracao.Model;

public class Cliente {
    private String nome;
    private TIpoCliente tIpoCliente;
    private TipoPagamento tipoPagamento;


    public Cliente(String nome, TIpoCliente tIpoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tIpoCliente = tIpoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tIpoCliente=" + tIpoCliente +
                ", tIpoClienteINT=" + tIpoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TIpoCliente gettIpoCliente() {
        return tIpoCliente;
    }

    public void settIpoCliente(TIpoCliente tIpoCliente) {
        this.tIpoCliente = tIpoCliente;
    }


}



