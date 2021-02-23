package pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import orcamento.Orcamento;

public class GeraPedido{

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens){
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente(){
        return cliente;
    }

    public BigDecimal getValorOrcamento(){
        return valorOrcamento;
    }

    public int getQuantidadeItens(){
        return quantidadeItens;
    }

}