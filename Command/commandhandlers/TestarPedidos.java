import java.math.BigDecimal;
import java.time.LocalDateTime;
import orcamento.Orcamento;
import pedido.GeraPedido;
import pedido.GeraPedidoHandler;
import pedido.Pedido;

public class TestarPedidos {
    
    public static void main(String[] args){
       String cliente = args[0];
       BigDecimal valorOrcamento = new BigDecimal(args[1]);
       int quantidadeItens = Integer.parseInt(args[2]);

       GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
       GeraPedidoHandler handler = new GeraPedidoHandler(/* dependencias */);
       handler.execute(gerador);
    }

}
