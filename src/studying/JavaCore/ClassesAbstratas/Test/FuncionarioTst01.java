package studying.JavaCore.ClassesAbstratas.Test;

import studying.JavaCore.ClassesAbstratas.Model.Desenvolvedor;
import studying.JavaCore.ClassesAbstratas.Model.Funcionario;
import studying.JavaCore.ClassesAbstratas.Model.Gerente;

public class FuncionarioTst01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5200);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Luffy", 10000);
        System.out.println(desenvolvedor);
    }
}
