package entities;

public class Precificacao {
	private double precoVenda;
	private double taxa;
	
	public Precificacao() {
	}
	
	public Precificacao(double precoVenda, double taxa) {
		super();
		this.precoVenda = precoVenda;
		this.taxa = taxa;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return "Preço de Venda: €" + precoVenda + " Taxa:" + taxa;
	}
	
	
}
