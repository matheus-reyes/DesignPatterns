import java.math.BigDecimal;
import java.time.LocalDateTime;
import orcamento.Orcamento;
import pedido.Pedido;

public class TestarPedidos {
    
    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        String cliente = "Matheus";
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(cliente, data, orcamento);

        System.out.println("Salvar Pedido no Banco de Dados (Ação)");
        System.out.println("Enviar e-mail com dados");
    }

}
