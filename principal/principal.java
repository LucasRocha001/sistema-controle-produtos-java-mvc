package principal;

import visao.TelaProduto;
import controle.ProdutoController;

public class principal {
	
	public static void main(String[] args) {
		
		TelaProduto tela = new TelaProduto();
		new ProdutoController(tela);
	}
}