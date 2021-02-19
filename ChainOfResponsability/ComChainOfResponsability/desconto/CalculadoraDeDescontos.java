package ComChainOfResponsability.desconto;

import java.math.BigDecimal;
import ComChainOfResponsability.orcamento.Orcamento;

public class CalculadoraDeDescontos{

    public BigDecimal calcular(Orcamento orcamento){

        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
            new DescontoParaOrcamentoMaiorQueQuinhentos(new SemDesconto()));

        return desconto.calcular(orcamento);
    }

}