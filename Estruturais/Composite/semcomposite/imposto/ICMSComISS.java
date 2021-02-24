package imposto;

import java.math.BigDecimal;
import orcamento.Orcamento;

public class ICMSComISS implements Imposto{

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal icms = new ICMS().calcular(orcamento);
        BigDecimal iss = new ISS().calcular(orcamento);
        return icms.add(iss);
    }
    
}
