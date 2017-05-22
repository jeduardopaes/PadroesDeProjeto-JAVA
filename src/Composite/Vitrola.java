package Composite;

public class Vitrola {
	
	ComponenteMusical listaDeMusicas;

	public Vitrola(ComponenteMusical listaDeMusicas) {
		this.listaDeMusicas = listaDeMusicas;
	}
	
	public void getListaDeMusicas(){
		listaDeMusicas.mostrarInformacoesDaMusica();
	}
	
	
}
