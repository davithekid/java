package studying.JavaCore.Construtores.Exercicios.Test;

import studying.JavaCore.Construtores.Exercicios.Model.Funcionario;

public class FuncionarioTest04 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Davi", 20, new double[]{100, 500, 1000});

        funcionario.imprimirDados();
        System.out.println(funcionario.calcularMediaSalarial());

    }
}
