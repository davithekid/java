package studying.JavaCore.Construtores.Exercicios.Test;

import studying.JavaCore.Construtores.Exercicios.Model.ContaCorrente;

public class ContaCorrenteTest03 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Carol", 0);
        contaCorrente.setNumeroConta(20); // isset numero da conta

        contaCorrente.mostrarInformacoes(); // informação inicial

        // deposito
        contaCorrente.depositar(500);
        System.out.println("\n DEPÓSITO EFETUADO!!!");
        contaCorrente.mostrarInformacoes();

        // saque
        contaCorrente.sacar(100);
        System.out.println("\n SAQUE EFETUADO!!!");
        contaCorrente.mostrarInformacoes();

    }
}
