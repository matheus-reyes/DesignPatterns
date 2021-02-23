package comStrategy.imposto;

import java.math.BigDecimal;
import comStrategy.orcamento.Orcamento;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
