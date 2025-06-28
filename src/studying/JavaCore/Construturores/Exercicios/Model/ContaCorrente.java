package studying.JavaCore.Construturores.Exercicios.Model;

public class ContaCorrente {
    private String titular;
    private int numeroConta;
    private  double saldo;

    public ContaCorrente(String titular, int saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void mostrarInformacoes(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo da conta: " + this.saldo);
    }








}
