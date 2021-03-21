public class Carteira {
	
	private String nomeBanco;
	private String tipoCartao;
	private double porcentagemCashback;
	
	Carteira(String banco,String tipoDeCartao, double cashback) {
		this.nomeBanco = banco;
		this.tipoCartao = tipoDeCartao;
		this.porcentagemCashback = cashback;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}
	
	public String getTipoCartao() {
		return tipoCartao;
	}
	
	public double getPorcentagemCashback() {
		return porcentagemCashback;
	}
	
	public void exibirCarteira() {
		System.out.printf("\n\nO dinheiro de toda a sua renda está na carteira do banco %s , na modalidade de cartão de %s.", nomeBanco, tipoCartao);
		System.out.printf("\nA porcentagem de cashback dele é igual %.2f =D", porcentagemCashback);
		
	}
	
}
