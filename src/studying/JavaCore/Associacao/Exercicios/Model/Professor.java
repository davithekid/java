package studying.JavaCore.Associacao.Exercicios.Model;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("Professor(a): " + this.nome);
        System.out.println("## Seminarios cadastrados ##");
        if (this.seminarios == null) return;
        for (Seminario seminario : this.seminarios) {
            System.out.println("Titulo: " + seminario.getTitulo());
            System.out.println("Endereço: " + seminario.getLocal().getEndereco());
            if(seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** Alunos Matriculados** ");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + ", idade: " + aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
