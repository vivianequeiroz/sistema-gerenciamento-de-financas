public class Usuario {
	
	private String nomeUsuario;
	
	Usuario(String nome) {
		this.nomeUsuario = nome;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public void exibirUsuario() {
		System.out.printf("Olá, %s! Esse é seu Sistema de Gerenciamento de Finanças =)", nomeUsuario);
	}
	

}
