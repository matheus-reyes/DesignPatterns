package orcamento;

import java.math.BigDecimal;

public class Orcamento{

    private BigDecimal valor;
    private int quantidadeItens;
    private String situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens){
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = BigDecimal.ZERO;
        if(situacao.equals("EM_ANALISE")){
            valorDescontoExtra = new BigDecimal("0.05");
        }else if(situacao.equals("APROVADO")){
            valorDescontoExtra = new BigDecimal("0.02");
        }
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(){
        situacao = "Aprovado";
    }

    public void reprovar(){
        situacao = "Reprovado";
    }

    public BigDecimal getValor(){
        return valor;
    }

    public int getQuantidadeItens(){
        return quantidadeItens;
    }

}