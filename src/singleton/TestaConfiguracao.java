package singleton;

public class TestaConfiguracao {

	public static void main(String[] args) {
		Configuracao qualquer = Configuracao.CriaConfiguracao("1920X1080p",true);
		Configuracao algum = Configuracao.CriaConfiguracao("800X600",true);
		
		System.out.println(qualquer.getResolucao()+"\n"+algum.getResolucao());
		System.out.println(qualquer+"\n"+algum);
		
		algum.alteraResolucao("800X600");
		
		System.out.println(algum.getResolucao()+"\n"+qualquer.getResolucao());
		
	}

}
