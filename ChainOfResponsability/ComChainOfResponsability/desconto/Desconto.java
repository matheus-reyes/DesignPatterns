package ComChainOfResponsability.desconto;

import java.math.BigDecimal;
import ComChainOfResponsability.orcamento.Orcamento;

public abstract class Desconto {

    protected Desconto proximo;
    
    public Desconto(Desconto proximo){
        this.proximo = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);


}
