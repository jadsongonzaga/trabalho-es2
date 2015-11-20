package loja.model;

import java.util.List;

public class WebPedido extends Pedido {
	
	

	public WebPedido(List<ItemPedido> listPedidos, Cliente cliente) {
		super(listPedidos, cliente);

	}

	@Override
	public double calcularFrete() {
		return  (calcularTotalItens() * 0.1);
	}

	@Override
	public double calcularImposto() {
		
		return  (calcularTotalItens() * 0.3);
	}

}
