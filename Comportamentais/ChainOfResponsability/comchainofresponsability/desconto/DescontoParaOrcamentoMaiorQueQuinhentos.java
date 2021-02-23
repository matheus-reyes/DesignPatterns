package comchainofresponsability.desconto;

import java.math.BigDecimal;
import comchainofresponsability.orcamento.Orcamento;

public class DescontoParaOrcamentoMaiorQueQuinhentos extends Desconto{

    public DescontoParaOrcamentoMaiorQueQuinhentos(Desconto proximo){
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){

        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        return proximo.calcular(orcamento);

    }

}