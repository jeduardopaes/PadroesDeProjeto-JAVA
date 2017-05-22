package factory;

public class UsuarioFactory {
	
	public static Usuario create(String nome, String cpf, String telefone, String senha, String nivelDeAcesso){
		
		if (nivelDeAcesso.equalsIgnoreCase("total")){
			return new UsuarioAdministrador(nome, cpf, telefone, senha, nivelDeAcesso);
		}else{
			return new UsuarioComum(nome, cpf, telefone, senha, nivelDeAcesso);
		}
		
	}
	
}
