package factory;

import javax.swing.JOptionPane;

public class UIFactory {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Digite seu Nome:");
		String cpf = "n/a"; //JOptionPane.showInputDialog(null, "Digite seu CPF:");
		String telefone = "n/a"; //JOptionPane.showInputDialog(null, "Digite seu Telefone:");
		String nivelDeAcesso = JOptionPane.showInputDialog(null, "Digite seu Nível De Acesso <Total / Comum>:");
		String senha = "n/a"; //JOptionPane.showInputDialog(null, "Digite seu Senha:");
		
		Usuario user1 = UsuarioFactory.create(nome, cpf, telefone, senha, nivelDeAcesso);
		
		nome = JOptionPane.showInputDialog(null, "Digite seu Nome:");
		cpf = "n/a"; //JOptionPane.showInputDialog(null, "Digite seu CPF:");
		telefone = "n/a"; //JOptionPane.showInputDialog(null, "Digite seu Telefone:");
		nivelDeAcesso = JOptionPane.showInputDialog(null, "Digite seu Nível De Acesso <Total / Comum>:");
		senha = "n/a"; //JOptionPane.showInputDialog(null, "Digite seu Senha:");
		
		Usuario user2 = UsuarioFactory.create(nome, cpf, telefone, senha, nivelDeAcesso);
		
		
		//user1.verificaNivelDeAcesso();
		//user2.verificaNivelDeAcesso();
		
		System.out.println(user1.getClass());
		System.out.println(user2.getClass());
		
		
	}

}
