package SemChainOfResponsability.desconto;

import java.math.BigDecimal;
import SemChainOfResponsability.orcamento.Orcamento;

public class CalculadoraDeDescontos{

    public BigDecimal calcular(Orcamento orcamento){

        BigDecimal desconto = new DescontoParaOrcamentoComMaisDeCincoItens().calcular(orcamento);

        if(desconto == BigDecimal.ZERO){
            desconto = new DescontoParaOrcamentoMaiorQueQuinhentos().calcular(orcamento);
        }

        return BigDecimal.ZERO;

    }

}