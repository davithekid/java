package studying.JavaCore.Classes.Exercicios.Teste;

import studying.JavaCore.Classes.Exercicios.Model.Funcionario;

public class FuncionarioTest05 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Davi";
        funcionario.idade = 20;
        funcionario.salario = new double[]{1000, 1.799, 900};

        funcionario.imprimir();
    }
}
