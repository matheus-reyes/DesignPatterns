import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import orcamento.Orcamento;
import pedido.GeraPedido;
import pedido.GeraPedidoHandler;
import pedido.Pedido;
import pedido.acao.EnviarEmailPedido;
import pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestarPedidos {
    
    public static void main(String[] args){
       String cliente = "Matheus";
       BigDecimal valorOrcamento = new BigDecimal("300");
       int quantidadeItens = Integer.parseInt("2");

       GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
       GeraPedidoHandler handler = new GeraPedidoHandler(
           Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
       );
       handler.execute(gerador);
    }

}
