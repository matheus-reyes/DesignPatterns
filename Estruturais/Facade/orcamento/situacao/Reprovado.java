package orcamento.situacao;

import orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{
    
    @Override
    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }

}
