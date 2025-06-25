
package studying.JavaCore.Classes.Exercicios.Model;

public class Retangulo {
    public double largura;
    public double altura;

    // método que calcula a área e retorna
    public double calcularArea() {
        return largura * altura;
    }

    // método que calcula o perímetro e retorna
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}
