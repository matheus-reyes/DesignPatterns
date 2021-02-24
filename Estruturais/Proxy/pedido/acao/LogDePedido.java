package pedido.acao;

import pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("Pedido realizado com sucesso: "+pedido);
    }

}