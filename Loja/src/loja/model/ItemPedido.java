package loja.model;

public class ItemPedido {
	
	private Produto produto;
	private double quantidade;
	
	
	
	public ItemPedido(Produto produto, double quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
	

}
