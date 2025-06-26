package studying.JavaCore.Classes.Exercicios.Model;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario = new double[3];

    public void imprimir() {
        System.out.println("Funcionário: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salario != null) {
            System.out.println("Salários recebidos:");
            for (double salario : this.salario) {
                System.out.print(" - R$" + salario);
            }
        }
        mediaSalario();
    }

    public void mediaSalario() {
        if(salario == null ){
            return;
        }
        double soma = 0;

        for (double num : this.salario) {
            soma += num;

        }
        double media = soma / this.salario.length;
        System.out.println("\nMedia salarial: " + media);
    }

}
