
public class MainSistemaFinancas {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Sofia");

		usuario.getNomeUsuario();
		usuario.exibirUsuario();
		
		
		RendaMensalFixa usuarioRendaMensal = new RendaMensalFixa("Estágio em Desenvolvimento de Software", 1500.0);
		
		usuarioRendaMensal.getNomeRendaFixa();
		usuarioRendaMensal.getValorRendaMensalFixa();
		usuarioRendaMensal.exibirRendaMensalFixa();
		
		
		CategoriaDespesas despesa1nome = CategoriaDespesas.ALIMENTACAO;
		Despesa despesa1valor = new Despesa(120.0);
		
		CategoriaDespesas despesa2nome = CategoriaDespesas.SAUDE;
		Despesa despesa2valor = new Despesa(80.0);
		
		CategoriaDespesas despesa3nome = CategoriaDespesas.INVESTIMENTOS;
		Despesa despesa3valor = new Despesa(200.0);
		
		CategoriaDespesas despesa4nome = CategoriaDespesas.MORADIA;
		Despesa despesa4valor = new Despesa(98.0);
		
		CategoriaDespesas despesa5nome = CategoriaDespesas.ANIVERSARIOS;
		Despesa despesa5valor = new Despesa(65.0);
		
		double despesasTotais = despesa1valor.getValorDespesa() + 
								despesa2valor.getValorDespesa() + 
								despesa3valor.getValorDespesa() + 
								despesa4valor.getValorDespesa() +
								despesa5valor.getValorDespesa();

		
		
		System.out.printf("\n\nAté o momento, essas  são suas despesas do mês de Março:");
		System.out.printf("\n %s     - R$ %.2f\n %s           - R$ %.2f\n %s   - R$ %.2f\n %s         - R$ %.2f\n %s    - R$ %.2f\n", 
						despesa1nome, despesa1valor.getValorDespesa(), 
						despesa2nome, despesa2valor.getValorDespesa(),
						despesa3nome, despesa3valor.getValorDespesa(),
						despesa4nome, despesa4valor.getValorDespesa(),
						despesa5nome, despesa5valor.getValorDespesa());
		
		
		System.out.printf("O que totaliza R$%.2f de despesas totais.", despesasTotais);
		
		
		
		
		
		
	}
}
