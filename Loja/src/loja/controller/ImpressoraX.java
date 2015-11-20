package loja.controller;

import loja.Utils;
import loja.model.ItemPedido;
import loja.model.IteratorItemPedido;
import loja.model.Pedido;

/**
 * Com conceitos de Visitor a impressora X so imprime 40 colunas
 * @author jadson
 *
 */
public class ImpressoraX implements Impressora {

	@Override
	public void imprimir(Pedido pedido) {
		IteratorItemPedido iterator = new IteratorItemPedido(pedido.getListPedidos());
		ItemPedido item;
		StringBuilder str = new StringBuilder();
		str.append("---------------------------------------\n");
		str.append(Utils.formataTexto(pedido.getCliente().getNome(),39)+"\n");
		str.append("---------------------------------------\n");
		str.append("VALOR            QTDE         TOTAL\n");
		str.append("---------------------------------------\n");
		while(!iterator.isDone()){
			item = iterator.next();
			str.append(Utils.formataTexto(item.getProduto().getNome(),39)+"\n");
			str.append(Utils.formataValor(item.getProduto().getPreco())+"          "+item.getQuantidade() + "          "+Utils.formataValor(item.getProduto().getPreco()*item.getQuantidade())+"\n");			
		}
		str.append("---------------------------------------\n");
		str.append("VALOR FRETE   : "+Utils.formataValor(pedido.calcularFrete())+"\n");
		str.append("VALOR IMPOSTO : "+Utils.formataValor(pedido.calcularImposto())+"\n");
		str.append("VALOR TOTAL   : "+Utils.formataValor(pedido.calcularPrecoTotal())+"\n");
		str.append("---------------------------------------\n");
		
		System.out.println(str.toString());
		
	}

}
