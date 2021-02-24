import java.math.BigDecimal;

import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import orcamento.OrcamentoProxy;

public class TestarComposicao {
 
    public static void main(String[] args){

        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("300")));
        novo.adicionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        System.out.println(novo.getValor());
    }

}
