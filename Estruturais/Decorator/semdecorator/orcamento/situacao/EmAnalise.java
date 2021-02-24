package orcamento.situacao;

import java.math.BigDecimal;
import orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento{
    
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }

}
