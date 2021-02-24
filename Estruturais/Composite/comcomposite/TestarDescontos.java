import java.math.BigDecimal;
import desconto.CalculadoraDeDescontos;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;

public class TestarDescontos {
    
    public static void main(String[] args){
        Orcamento orcamento1 = new Orcamento();
        Orcamento orcamento2 = new Orcamento();

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(orcamento1));
        System.out.println(calculadora.calcular(orcamento2));
    }

}
