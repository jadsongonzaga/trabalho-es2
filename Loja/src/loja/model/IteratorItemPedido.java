package loja.model;

import java.util.List;

/**
 * Classe que aplica os conceitos de Iterator
 * @author jadson
 *
 */
public class IteratorItemPedido {
	
	private final List<ItemPedido> lista;
	private int indexAtual = 0;
	
	public IteratorItemPedido(List<ItemPedido> lista){
		this.lista = lista;
	}
	
	public ItemPedido currentItem(){
		
		return lista.get(indexAtual);
		
	}
	
	public ItemPedido next(){
		return lista.get(indexAtual ++ );
	}
	
	public ItemPedido first(){
		return lista.get(0);
	}
	
	
	public boolean isDone(){
		return indexAtual == lista.size();
	}
	
	

}
