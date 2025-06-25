
package studying.JavaCore.Classes.Exercicios.Teste;

import studying.JavaCore.Classes.Exercicios.Model.Retangulo;

public class RetanguloTest01 {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.largura = 20;
        retangulo.altura = 10;

        System.out.println("A área do retângulo é: " + retangulo.calcularArea());
        System.out.println("O perímetro do retângulo é: " + retangulo.calcularPerimetro());
    }
}
