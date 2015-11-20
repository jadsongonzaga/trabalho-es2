package loja;

import java.util.ArrayList;
import java.util.List;

import loja.controller.Impressao;
import loja.controller.ImpressoraX;
import loja.controller.ImpressoraY;
import loja.model.Cliente;
import loja.model.ItemPedido;
import loja.model.PedidoPresencial;
import loja.model.Produto;
import loja.model.WebPedido;

/**
 * 
 * @author jadson
 *
 */
public class Main {
	
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "João da Silva");
		
		Produto p1 = new Produto(1, "SmartPhone Moto G", 999.99);
		Produto p2 = new Produto(1, "Mouse Sem Fio", 100.50);
		Produto p3 = new Produto(1, "Monitor LG", 300.33);
		
		ItemPedido item1 = new ItemPedido(p1, 1);
		ItemPedido item2 = new ItemPedido(p2, 3);
		ItemPedido item3 = new ItemPedido(p3, 2);
		
		List<ItemPedido> itens = new ArrayList<>();
		
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		
		WebPedido w = new WebPedido(itens, cliente);
		PedidoPresencial p = new  PedidoPresencial(itens, cliente);
		
		ImpressoraX impressoraX = new ImpressoraX();
		ImpressoraY impressoraY = new ImpressoraY();
		Impressao.imprimir(impressoraX, w);
		Impressao.imprimir(impressoraY, p);
		
		
		
		
		
	}

}
