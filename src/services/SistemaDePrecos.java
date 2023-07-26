package services;

public class SistemaDePrecos implements CalculadoraProduto{

	@Override
	public double calcularTaxa(double precoBase) {
		Double taxa = 0.00;
		if(precoBase > 1 && precoBase < 10 ) {
			taxa = 0.1;
		}else if(precoBase > 10 && precoBase < 20 ) {
			taxa = 0.2;
		}else if(precoBase > 20 && precoBase < 50 ) {
			taxa = 0.4;
		}
		else if(precoBase > 50) {
			taxa = 0.6;
		}
		return taxa;
	}

	@Override
	public double calcularPrecoVenda(double precoBase) {
		Double precoVenda = 0.00;
		
		precoVenda = (precoBase*calcularTaxa(precoBase))+ precoBase;
		
		return precoVenda;
	}
	
	
}
