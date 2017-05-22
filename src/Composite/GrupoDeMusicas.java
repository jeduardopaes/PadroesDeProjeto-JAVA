package Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class GrupoDeMusicas extends ComponenteMusical{

	ArrayList componentesMusicais = new ArrayList();
	
	String nomeDoGrupo;
	String descricaoDoGrupo;
	
	public GrupoDeMusicas(String nomeDoGrupo, String descricaoDoGrupo) {
		this.nomeDoGrupo = nomeDoGrupo;
		this.descricaoDoGrupo = descricaoDoGrupo;
	}

	public String getNomeDoGrupo() {
		return nomeDoGrupo;
	}

	public void setNomeDoGrupo(String nomeDoGrupo) {
		this.nomeDoGrupo = nomeDoGrupo;
	}

	public String getDescricaoDoGrupo() {
		return descricaoDoGrupo;
	}

	public void setDescricaoDoGrupo(String descricaoDoGrupo) {
		this.descricaoDoGrupo = descricaoDoGrupo;
	}
	
	public void add(ComponenteMusical novoComponenteMusical){
		componentesMusicais.add(novoComponenteMusical);
	}
	
	public void remover(ComponenteMusical componenteMusical){
		this.componentesMusicais.remove(componenteMusical);
	}
	
	public ComponenteMusical getComponenteMusical(int indexDoComponente){
		return (ComponenteMusical) componentesMusicais.get(indexDoComponente);
	}
	
	public void mostrarInformacoesDaMusica(){
		
		System.out.println(getNomeDoGrupo() + " " +
				getDescricaoDoGrupo()+ "\n");
		
		Iterator iteradorDasMusicas = componentesMusicais.iterator();
		
		while(iteradorDasMusicas.hasNext()){
			
			ComponenteMusical infoMusica = (ComponenteMusical) iteradorDasMusicas.next();
			infoMusica.mostrarInformacoesDaMusica();
		}
	}
	
}
