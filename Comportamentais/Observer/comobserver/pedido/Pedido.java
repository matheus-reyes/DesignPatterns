package pedido;

import java.time.LocalDateTime;
import orcamento.Orcamento;

public class Pedido{

    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento){
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    

}