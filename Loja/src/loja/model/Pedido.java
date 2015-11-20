package loja.model;

import java.util.List;

/**
 * Classe abstrata de pedido com os conceitos de Template Method
 * @author jadson
 *
 */
public abstract class Pedido {
	
	private Cliente cliente;
	private List<ItemPedido> listPedidos;
	
	public Pedido(List<ItemPedido> listPedidos, Cliente cliente) {
		
		this.listPedidos = listPedidos; 
		this.cliente = cliente;
		
	}
	
	/**
	 * Template Method
	 * @return
	 */
	public double calcularPrecoTotal(){
		return calcularFrete() + calcularImposto() + calcularTotalItens();
	}
	
	public double calcularTotalItens(){
		IteratorItemPedido iterator = new IteratorItemPedido(listPedidos);
		double precoTotal = 0;
		ItemPedido item;
		
		
		while(!iterator.isDone()){
			item = iterator.next();
			precoTotal += item.getProduto().getPreco() * item.getQuantidade(); 
		}
		
		
		return precoTotal;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public List<ItemPedido> getListPedidos() {
		return listPedidos;
	}

	public abstract double calcularFrete();
	
	public abstract double calcularImposto();

}
