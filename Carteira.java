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
		System.out.printf("\n\nO dinheiro de toda a sua renda está na conta corrente do banco %s, onde você possui %s.\n", nomeBanco, tipoCartao);
		System.out.printf("\nA porcentagem de cashback a cada pagamento com o cartão é igual %.2f por mês =D", porcentagemCashback);
		
	}
	
}

