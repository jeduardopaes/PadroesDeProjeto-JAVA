package factory;

public class UsuarioComum extends Usuario {
	
	public UsuarioComum(String nome, String cpf, String telefone, String senha, String nivelDeAcesso) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.senha = senha;
		this.nivelDeAcesso = nivelDeAcesso;
	}

	@Override
	public void verificaNivelDeAcesso() {
		System.out.println("Usuário: "+this.nome+"\nNível limitado de acesso");
	}
	
}
