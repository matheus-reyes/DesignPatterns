package comStrategy.orcamento;

import java.math.BigDecimal;
import comStrategy.imposto.*;

public class TestesOrcamento {
    
    public static void main(String[] args){

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));

    }

}