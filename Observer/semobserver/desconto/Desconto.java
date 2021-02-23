package desconto;

import java.math.BigDecimal;
import orcamento.Orcamento;

public abstract class Desconto {

    protected Desconto proximo;
    
    public Desconto(Desconto proximo){
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)) return efetuarCalculo(orcamento);
        else return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    public abstract boolean deveAplicar(Orcamento orcamento);


}
