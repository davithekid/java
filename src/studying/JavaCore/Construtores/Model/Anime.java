package studying.JavaCore.Construtores.Model;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    // construtor
    // inicializador dos objetos
    // só tem modificadores de acesso
    public Anime(String nome, String tipo, int episodios, String genero) {
        System.out.println("Dentro do construtor");
        this.nome = nome;
        this.genero = genero;
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }


    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void imprime() {
        System.out.println(getNome());
        System.out.println(getTipo());
        System.out.println(getEpisodios());
        System.out.println(getGenero());
    }

//    public void init(String nome, String tipo, int episodios) {
//        this.nome = nome;
//        this.tipo = tipo;
//        this.episodios = episodios;
//
//    }
//
//    // sobrecarga de metodos
//    // nao preciso fazer init2 (ele ja entende qual usar)
//    public void init(String nome, String tipo, int episodios, String genero) {
//        this.init(nome, tipo, episodios);
//        this.genero = genero;
//    }
}

