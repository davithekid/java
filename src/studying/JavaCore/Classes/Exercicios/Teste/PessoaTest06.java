package studying.JavaCore.Classes.Exercicios.Teste;

import studying.JavaCore.Classes.Exercicios.Model.Pessoa;

public class PessoaTest06 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Davi");
        pessoa.setIdade(20);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
