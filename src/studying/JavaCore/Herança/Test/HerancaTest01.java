package studying.JavaCore.Herança.Test;

import studying.JavaCore.Herança.Model.Endereco;
import studying.JavaCore.Herança.Model.Funcionario;
import studying.JavaCore.Herança.Model.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 4", "0181-820");
        Pessoa pessoa = new Pessoa("Davi" , "123123123-11", endereco);
        Funcionario funcionario = new Funcionario("Davi", "323211123-23", endereco);
        funcionario.setSalario(1331);

        System.out.println("## Pessoa ##");
        pessoa.imprime();
        System.out.println("-----------------");
        System.out.println("## Funcionario ##");
        funcionario.imprime();

    }

}
