package studying.JavaCore.Enumeracao.Model;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor){
            return valor * 0.05;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    };

    // metodo criado apenas para ser sobrescrito
    public abstract double calcularDesconto(double valor);
}
