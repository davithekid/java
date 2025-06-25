package studying.JavaCore.Classes.Exercicios.Teste;

import studying.JavaCore.Classes.Exercicios.Model.Livro;

public class LivroTest04 {
    public static void main(String[] args) {
        // atribuindo variaveis de ref pra cada livro
        Livro livro = new Livro();
        Livro livro2 = new Livro();

        // livro 1
        livro.titulo = "Harry Potter e a pedra filosofal";
        livro.autor = "J.K Rolling";
        livro.anoPublicacao = 2000;

        // livro 2
        livro2.titulo = "One piece";
        livro2.autor = "Oda";
        livro2.anoPublicacao = 1997;

        livro.exibirFichaTecnica();
        livro2.exibirFichaTecnica();

    }
}
