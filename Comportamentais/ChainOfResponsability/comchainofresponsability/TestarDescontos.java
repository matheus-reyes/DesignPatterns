package comchainofresponsability;

import java.math.BigDecimal;
import comchainofresponsability.desconto.CalculadoraDeDescontos;
import comchainofresponsability.orcamento.Orcamento;

public class TestarDescontos {
    
    public static void main(String[] args){
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("6000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(orcamento1));
        System.out.println(calculadora.calcular(orcamento2));
    }

}
