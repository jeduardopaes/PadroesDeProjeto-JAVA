package factory;

public class UsuarioAdministrador extends Usuario {

	public UsuarioAdministrador(String nome, String cpf, String telefone, String senha, String nivelDeAcesso) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.senha = senha;
		this.nivelDeAcesso = nivelDeAcesso;
	}

	@Override
	public void verificaNivelDeAcesso() {
		// TODO Auto-generated method stub
		
	}

	
	/*
	public void verificaNivelDeAcesso(){
		System.out.println("Usuário: "+this.nome+"\nNível máximo de acesso");
	}
	*/
	
}
