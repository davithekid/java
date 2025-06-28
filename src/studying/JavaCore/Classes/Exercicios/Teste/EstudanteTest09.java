package studying.JavaCore.Classes.Exercicios.Teste;

import studying.JavaCore.Classes.Exercicios.Model.Estudante;

public class EstudanteTest09 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        // setters
        estudante.setNome("Davi");
        estudante.setNotas(new double[]{10, 6, 8});

        // getters
        System.out.println(estudante.getNome());
        System.out.print("Notas:");
        // percorrendo as notas
        for (double nota : estudante.getNotas()) {
            System.out.print(" - " + nota);
        }

        // resultado final
        System.out.println("\n A média do estudante é: " + estudante.calcularMedia());
    }
}
