package studying.JavaCore.Enumeracao.Test;

import studying.JavaCore.Enumeracao.Model.Cliente;
import studying.JavaCore.Enumeracao.Model.TIpoCliente;
import studying.JavaCore.Enumeracao.Model.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Deku", TIpoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Todoroki", TIpoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(129));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(129));
    }
}
