public class MovimentacaoBancaria {
	private double valorTransacao;
	private CategoriaDespesas despesaPaga;



	public void exibirDataTransacao(String data) {
		System.out.printf("\nTransação feita em %s\n", data);
	}


	public double getValorTransacao(double valor1, double valor2, double valor3) {
		return valorTransacao;
	}


	public CategoriaDespesas getDespesaPaga() {
		return despesaPaga;
	}

	

}