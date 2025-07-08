package studying.JavaCore.Herança.Model;

// herança da classe Pessoa
public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco) {
        super(nome, cpf, endereco);
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu" + this.nome + "recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
