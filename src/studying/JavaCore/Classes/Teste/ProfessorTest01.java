package studying.JavaCore.Classes.Teste;

import studying.JavaCore.Classes.Model.Professor;

public class ProfessorTest01
{
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Davi";
        professor.idade = 20;
        professor.sexo = 'M';
        System.out.print("Nome: " + professor.nome + ", Sexo:"+ professor.sexo + ", idade:" +  professor.idade);
    }
}
