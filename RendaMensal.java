
public class RendaMensal implements RendaExtra {

	private String nomeRendaMensal;
	private double valorRendaMensal;
	
	
	
	RendaMensal(String nomeRenda, double valorRenda) {
		this.nomeRendaMensal = nomeRenda;
		this.valorRendaMensal = valorRenda;
	}
	
	public String getNomeRenda() {
		return nomeRendaMensal;
	}
	
	public double getValorRendaMensal() {
		return valorRendaMensal;
	}
	
	public void exibirRendaMensal() {
		System.out.printf("\n\nHoje, sua Renda Mensal fixa tem o valor de: R$ %.2f e provém de: %s \n", valorRendaMensal, nomeRendaMensal);
		System.out.println("\nE esses são os retornos de sua Renda Extra:");
	}

   // métodos da interface	
	
	public String getNomeInvestimento(String nomeInvestimento) {
		System.out.printf(" - Investimento em: %s ", nomeInvestimento);
		return  nomeInvestimento;
	}

	
	public double getLucroInvestimento(double lucroInvestimento) {
		System.out.printf(" 				    	   | Lucro = R$ %.2f \n", lucroInvestimento);
		return lucroInvestimento;
	}


	public String getTrabalhoFreelancer(String trabalhoFreelancer) {
		System.out.printf(" - Trabalho Freelancer em: %s ", trabalhoFreelancer);
		return trabalhoFreelancer;
	}

	
	public double getRetornoFreelancer(double retornoFreelancer) {
		System.out.printf(" | Lucro de: R$ %.2f \n", retornoFreelancer);
		return retornoFreelancer;
	}

	public String getVendaDesapego(String vendaDesapego) {
		System.out.printf(" - Venda de um desapego: %s ", vendaDesapego);
		return vendaDesapego;
	}

	public double getLucroVendaDesapego(double retornoLucroDesapego) {
		System.out.printf(" 				   | Lucro = R$ %.2f \n", retornoLucroDesapego);
		return retornoLucroDesapego;
	}
	
}
