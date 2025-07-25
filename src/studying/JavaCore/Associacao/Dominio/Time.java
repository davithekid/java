package studying.JavaCore.Associacao.Dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;

    }

    public void imprime(){
        System.out.println(this.nome);
        if(jogadores == null) return;
        for(Jogador jogador : jogadores){
            System.out.println(jogador.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
