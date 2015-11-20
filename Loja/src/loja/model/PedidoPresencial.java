package loja.model;

import java.util.List;

public class PedidoPresencial extends Pedido {
	
	

	public PedidoPresencial(List<ItemPedido> listPedidos, Cliente cliente) {
		super(listPedidos, cliente);
	}
	
	@Override
	public double calcularFrete() {
		
		return  0;
	}

	@Override
	public double calcularImposto() {

		return  (calcularTotalItens() * 0.3);
	}



}
