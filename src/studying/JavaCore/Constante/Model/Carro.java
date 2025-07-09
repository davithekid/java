package studying.JavaCore.Constante.Model;

public class Carro {
    private String nome;
    // CONSTANTE EM JAVA NECESSITA SER UPPERCASE E ESSA É A SINTAXE
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
}
