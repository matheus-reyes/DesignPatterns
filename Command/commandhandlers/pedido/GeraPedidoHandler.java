package pedido;

import java.time.LocalDateTime;
import orcamento.Orcamento;

public class GeraPedidoHandler {

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar Pedido no Banco de Dados (Ação)");
        System.out.println("Enviar e-mail com dados");
    }

}