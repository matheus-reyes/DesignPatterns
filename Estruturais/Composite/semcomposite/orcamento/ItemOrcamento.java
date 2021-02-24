package orcamento;

import java.math.BigDecimal;

public class ItemOrcamento{

    private BigDecimal valor;

    public ItemOrcamento(BigDecimal valor){
        this.valor = valor;
    }

    public BigDecimal getValor(){
        return valor;
    }

}