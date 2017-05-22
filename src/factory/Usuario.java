package factory;

public abstract class Usuario {
	
	protected String nome;
	protected String telefone;
	protected String cpf;
	protected String nivelDeAcesso;
	protected String senha;
	
	
	public abstract void verificaNivelDeAcesso();
	
}
