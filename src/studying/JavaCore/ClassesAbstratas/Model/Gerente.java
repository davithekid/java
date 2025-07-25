package studying.JavaCore.ClassesAbstratas.Model;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void imprime() {

    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.10;
    }
}
