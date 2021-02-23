package comchainofresponsability.desconto;

import java.math.BigDecimal;
import comchainofresponsability.orcamento.Orcamento;

public class CalculadoraDeDescontos{

    public BigDecimal calcular(Orcamento orcamento){

        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
            new DescontoParaOrcamentoMaiorQueQuinhentos(new SemDesconto()));

        return desconto.calcular(orcamento);
    }

}