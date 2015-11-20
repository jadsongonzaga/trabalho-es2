package loja.controller;

import loja.model.Pedido;

public class Impressao {
	
	public static void imprimir(Impressora impressora, Pedido pedido){
		impressora.imprimir(pedido);
	}

}
