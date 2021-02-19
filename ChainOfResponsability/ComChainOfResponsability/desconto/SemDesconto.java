package ComChainOfResponsability.desconto;

import java.math.BigDecimal;
import ComChainOfResponsability.orcamento.Orcamento;

public class SemDesconto extends Desconto{

    public SemDesconto(){
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento){

        return BigDecimal.ZERO;

    }
    
}
