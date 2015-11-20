package loja;

import java.text.DecimalFormat;

public class Utils {
	public static String formataValor(double valor){
		return  new DecimalFormat("###,##0.00").format(valor);
	}
	
	public static String formataTexto(String texto, int tamanho){
		
		if(texto.length() > tamanho)
			texto = texto.substring(0, tamanho);
		
		return  texto;
	}


}
