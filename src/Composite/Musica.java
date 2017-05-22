package Composite;

public class Musica extends ComponenteMusical {

	String nomeDaMusica;
	String nomeDaBanda;
	int anoDeLancamento;
	
	
	public Musica(String nomeDaMusica, String nomeDaBanda, int anoDeLancamento) {
		this.nomeDaMusica = nomeDaMusica;
		this.nomeDaBanda = nomeDaBanda;
		this.anoDeLancamento = anoDeLancamento;
	}


	public String getNomeDaMusica() {
		return nomeDaMusica;
	}


	public void setNomeDaMusica(String nomeDaMusica) {
		this.nomeDaMusica = nomeDaMusica;
	}


	public String getNomeDaBanda() {
		return nomeDaBanda;
	}


	public void setNomeDaBanda(String nomeDaBanda) {
		this.nomeDaBanda = nomeDaBanda;
	}


	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}


	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public void mostrarInformacoesDaMusica(){
		System.out.println("  "+getNomeDaMusica()+ " foi lançada pela banda " + getNomeDaBanda()+" em "+ getAnoDeLancamento()+"\n");
	}
	
	
}
