package studying.JavaCore.Classes.Exercicios.Teste;

import studying.JavaCore.Classes.Exercicios.Model.ContaBancaria;

public class ContaBancariaTest07 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setTitular("Davi");
        contaBancaria.setNumeroConta(300);

        System.out.println("Titular: " + contaBancaria.getTitular());
        System.out.println("Número da conta: " + contaBancaria.getNumeroConta());
        System.out.println("Saldo Atual: " + contaBancaria.saldo());

        contaBancaria.depositar(640); // depositando
        System.out.println("Saldo Atual pós depósito: " + contaBancaria.saldo());

        contaBancaria.sacar(10); // sacando
        System.out.println("Saldo atual pós saque: " + contaBancaria.saldo());

    }
}
