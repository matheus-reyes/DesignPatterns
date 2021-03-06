package semchainofresponsability.desconto;

import java.math.BigDecimal;

import semchainofresponsability.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens {

    public BigDecimal calcular(Orcamento orcamento){

        if(orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;

    }

}