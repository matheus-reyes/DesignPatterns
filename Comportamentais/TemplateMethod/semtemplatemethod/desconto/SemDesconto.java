package desconto;

import java.math.BigDecimal;
import orcamento.Orcamento;

public class SemDesconto extends Desconto{

    public SemDesconto(){
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento){

        return BigDecimal.ZERO;

    }
    
}
