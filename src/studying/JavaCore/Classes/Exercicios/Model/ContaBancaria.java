package studying.JavaCore.Classes.Exercicios.Model;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    // set
    public void setTitular(String titular) {
       this.titular = titular;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getTitular(){
        return this.titular;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }


    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo = this.saldo - valor;
    }

    public double saldo(){
        return saldo;
    }


}

