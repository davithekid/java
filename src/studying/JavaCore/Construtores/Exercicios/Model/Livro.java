package studying.JavaCore.Construtores.Exercicios.Model;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(String titulo, int ano, String autor) {
        this(titulo, autor);
        this.ano = ano;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getAno(){
        return this.ano;
    }

    public void exibirFicha(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano : " + this.ano);
    }


}
