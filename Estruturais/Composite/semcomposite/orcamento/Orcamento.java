package orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import orcamento.situacao.SituacaoOrcamento;
import orcamento.situacao.EmAnalise;

public class Orcamento{

    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<ItemOrcamento> itens;

    public Orcamento(){
        this.valor = BigDecimal.ZERO;
        this.situacao = new EmAnalise();
        this.itens = new ArrayList<>();
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor(){
        return valor;
    }

    public int getQuantidadeItens(){
        return itens.size();
    }

    public void setSituacao(SituacaoOrcamento situacao){
        this.situacao = situacao;
    }

    public SituacaoOrcamento getSituacao(){
        return situacao;
    }

    public void adicionarItem(ItemOrcamento item){
        this.itens.add(item);
        this.valor = valor.add(item.getValor());
    }

}