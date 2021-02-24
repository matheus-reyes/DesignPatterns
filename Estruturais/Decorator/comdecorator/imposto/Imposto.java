package imposto;

import java.math.BigDecimal;
import orcamento.Orcamento;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro){
        this.outro = outro;
    }

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoOutroImposto = realizarCalculo(orcamento);
        if(outro != null) valorDoOutroImposto = outro.realizarCalculo(orcamento);
        return valorImposto.add(valorDoOutroImposto);
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

}
