
public class RendaMensalFixa {

	private String nomeRendaMensalFixa;
	private double valorRendaMensalFixa;
	
	RendaMensalFixa(String nomeRendaFixa, double valorRendaFixa) {
		this.nomeRendaMensalFixa = nomeRendaFixa;
		this.valorRendaMensalFixa = valorRendaFixa;
	}
	
	public String getNomeRendaFixa() {
		return nomeRendaMensalFixa;
	}
	
	public double getValorRendaMensalFixa() {
		return valorRendaMensalFixa;
	}
	
	public void exibirRendaMensalFixa() {
		System.out.printf("\n\nHoje, sua Renda Mensal fixa tem o valor de: R$ %.2f e provém de: %s", valorRendaMensalFixa, nomeRendaMensalFixa);
	}
}
