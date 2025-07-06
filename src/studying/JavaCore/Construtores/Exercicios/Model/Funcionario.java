package studying.JavaCore.Construtores.Exercicios.Model;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = new double[3];

    public Funcionario(String nome, int idade, double[] salarios) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getSalarios() {
        return this.salarios;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Salários: ");

        for (double salario : this.salarios) {
            System.out.print("R$" + salario + " - ");
        }
    }

    public double calcularMediaSalarial() {
//        double soma = 0;
//        for(int i = 0; i < salarios.length; i++){
//            soma += salarios[i];
//        }

        double soma = 0;
        for (double salario : salarios) {
            soma += salario;
        }
        return soma / salarios.length;
    }
}
