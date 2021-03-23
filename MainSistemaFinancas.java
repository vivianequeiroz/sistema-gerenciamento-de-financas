import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainSistemaFinancas {

	public static void main(String[] args) {
		
		//criando usuario
		Usuario usuario = new Usuario("Sofia");
		usuario.exibirUsuario();
		
		//inserindo receitas
		System.out.println("\n\n");
		System.out.println(" ************************************************ R E C E I T A S ************************************************");
		
		
		RendaMensal usuarioRendaMensal = new RendaMensal("Estágio em Desenvolvimento de Software", 1200.0);
		usuarioRendaMensal.exibirRendaMensal();
		
		double rendaMensal = usuarioRendaMensal.getValorRendaMensal();
		
		
		usuarioRendaMensal.getNomeInvestimento("Bitcoin");
		double investimento = usuarioRendaMensal.getLucroInvestimento(120.0);
		
		
		usuarioRendaMensal.getTrabalhoFreelancer("Desenvolvimento landing page - Workana");
		double freelancer = usuarioRendaMensal.getRetornoFreelancer(600.89);
		
		usuarioRendaMensal.getVendaDesapego("Criado mudo");
		double desapego = usuarioRendaMensal.getLucroVendaDesapego(350.75);
		
		
	
		double rendaExtraTotal = investimento + freelancer + desapego;
		
		System.out.printf("\nTotal da renda extra: %.2f", rendaExtraTotal);
		
		
		//calculando receitas totais
		double rendaTotal = rendaMensal + rendaExtraTotal;
		System.out.printf("\n\n\n                                               RECEITA TOTAL = R$ %.2f\n\n", rendaTotal);
		
		
		
		//inserindo despesas
		System.out.println("\n\n");
		System.out.println(" ************************************************ D E S P E S A S  ************************************************");
		
		
		
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

		
		
		System.out.printf("\n\nEssas foram as despesas registradas:\n");
		System.out.printf("\n %s     - R$ %.2f\n %s           - R$ %.2f\n %s   - R$ %.2f\n %s         - R$ %.2f\n %s    - R$ %.2f\n", 
						despesa1nome, despesa1valor.getValorDespesa(), 
						despesa2nome, despesa2valor.getValorDespesa(),
						despesa3nome, despesa3valor.getValorDespesa(),
						despesa4nome, despesa4valor.getValorDespesa(),
						despesa5nome, despesa5valor.getValorDespesa());
		
		LocalDate hoje = LocalDate.now();
		
	    DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    
		System.out.printf("\n Até a data de " + hoje.format(formatadorBarra) + ":\n\n", despesasTotais);
		System.out.printf("\n\n\n                                               DESPESA TOTAL = R$ %.2f\n\n", despesasTotais);
		
		
		//dados da carteira
		System.out.println("\n\n");
		System.out.println(" ************************************************ C A R T E I R A  ************************************************");
	
		
		Carteira carteira = new Carteira("Inter", "crédito", 7.5);
		
		
		carteira.exibirCarteira();
		
		
		
		//dados de pagamentos
				System.out.println("\n\n\n\n");
				System.out.println(" ********************************************** P A G A M E N T O S  **********************************************");

				
		MovimentacaoBancaria movimentacao1 = new MovimentacaoBancaria();
		
		
		movimentacao1.getValorTransacao(despesa1valor.getValorDespesa(), despesa2valor.getValorDespesa(), despesa3valor.getValorDespesa());
		CategoriaDespesas despesaPaga1 =  despesa1nome;
		CategoriaDespesas despesaPaga2 =  despesa2nome;
		CategoriaDespesas despesaPaga3 =  despesa3nome;
		
		double movimentacao1ValorTotal =  despesa1valor.getValorDespesa() + (despesa2valor.getValorDespesa()/2) + despesa3valor.getValorDespesa();
		
		movimentacao1.exibirDataTransacao("06/03/2021");
		
		double saldoRestante1 = rendaTotal - movimentacao1ValorTotal;
	
		System.out.printf("\n\nAs depesas pagas foram:");
		System.out.printf("\n\n - %s (parcela 1 de 2) \n - %s \n - %s ", despesa1nome, despesa2nome, despesa3nome);
		System.out.printf("\n\n TOTAL PAGO...................... R$ %.2f ", movimentacao1ValorTotal);
		System.out.printf("\n\n SALDO EM CONTA................. R$ %.2f ", saldoRestante1);
		
		System.out.println("\n\n");
		
		
		MovimentacaoBancaria movimentacao2 = new MovimentacaoBancaria();
		
		
		movimentacao2.getValorTransacao(despesa2valor.getValorDespesa(), despesa4valor.getValorDespesa(), despesa5valor.getValorDespesa());
		CategoriaDespesas despesaPaga4 =  despesa2nome;
		CategoriaDespesas despesaPaga5 =  despesa4nome;
		CategoriaDespesas despesaPaga6 =  despesa5nome;
		
		double movimentacao2ValorTotal =   (despesa2valor.getValorDespesa()/2) + despesa4valor.getValorDespesa() + despesa5valor.getValorDespesa();
		
		movimentacao1.exibirDataTransacao("19/03/2021");
		
		
		double saldoRestante2 = saldoRestante1 - movimentacao2ValorTotal;
	
		System.out.printf("\n\nAs depesas pagas foram:");
		System.out.printf("\n\n - %s (parcela 2 de 2)\n - %s \n - %s ", despesa2nome, despesa4nome, despesa5nome);
		System.out.printf("\n\n TOTAL PAGO...................... R$ %.2f ", movimentacao2ValorTotal);
		System.out.printf("\n\n SALDO EM CONTA................. R$ %.2f ", saldoRestante2);
		
		System.out.println("\n\n");
		
	}
}
