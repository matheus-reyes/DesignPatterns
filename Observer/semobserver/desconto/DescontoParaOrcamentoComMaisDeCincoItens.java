package desconto;

import java.math.BigDecimal;
import orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto{

    public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo){
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    public boolean deveAplicar(Orcamento orcamento){
        return orcamento.getQuantidadeItens() > 5;
    }

}