package services;

import entities.Livro;
import entities.Precificacao;

public class CalcularPrecificacao {

	private CalculadoraProduto cp;
	
	public CalcularPrecificacao(CalculadoraProduto cp) {
		this.cp = cp;
	}
	
	public void addPrecario(Livro livro) {
		livro.setPrecificacao(new Precificacao(cp.calcularPrecoVenda(livro.getPrecoBase()),cp.calcularTaxa(livro.getPrecoBase())));
	}
}
