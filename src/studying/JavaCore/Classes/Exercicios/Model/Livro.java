package studying.JavaCore.Classes.Exercicios.Model;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public void exibirFichaTecnica() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao);
    }

}
