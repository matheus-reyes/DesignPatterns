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

    public void executa(){
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);

        Pedido pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);

        System.out.println("Salvar Pedido no Banco de Dados (Ação)");
        System.out.println("Enviar e-mail com dados");
    }

}