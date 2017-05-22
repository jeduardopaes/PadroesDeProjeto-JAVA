package singleton;

public class Configuracao {

	private static Configuracao instance = null;
	private String resolucao;
	private boolean telaCheia;
	
	private Configuracao(String resolucao, boolean telaCheia){
		this.resolucao = resolucao;
		this.telaCheia = telaCheia;
	}
	
	public static Configuracao CriaConfiguracao(String resolucao, boolean telaCheia){
		if(instance == null){
			instance = new Configuracao(resolucao, telaCheia);	
		}
		return instance;
	}
	
	public void alteraResolucao(String resolucao){
		instance.resolucao = resolucao;
	}
	
	public void alterarTelaCheia(boolean telaCheia){
		instance.telaCheia = telaCheia;
	}

	public String getResolucao() {
		return resolucao;
	}

	public boolean isTelaCheia() {
		return telaCheia;
	}
	
	
	
}
