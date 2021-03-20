
public enum CategoriaDespesas {
	
	ALIMENTACAO("Alimentação"),
	MORADIA("Moradia"), 
	GASOLINA("Gasolina"), 
	ASSINATURAS("Assinaturas"),
	SAUDE("Saúde"), 
	LAZER("Lazer"), 
	INVESTIMENTOS("Investimentos"), 
	VESTIMENTA("Vestimenta"), 
	ANIVERSARIOS("Aniversarios");
	
	static String descricao;
	

	CategoriaDespesas(String descricao) {
		return;
	}

	
	public String getDescricao() {
		return CategoriaDespesas.descricao;
	}
	
}
