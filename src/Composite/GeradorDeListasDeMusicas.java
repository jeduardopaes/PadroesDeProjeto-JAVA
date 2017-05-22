package Composite;

public class GeradorDeListasDeMusicas {
	
	public static void main(String[] args) {
		
		ComponenteMusical musicasClassica = new GrupoDeMusicas("Classica", "M�sicas para pessoas com muito dinheiro e com n�vel cultural considerado elevado.");
		
		
		ComponenteMusical musicasHeavyMetal = new GrupoDeMusicas("Heavy Metal", "M�sicas para quem gosta de barulho e gritaria.");
		
		ComponenteMusical musicasForro = new GrupoDeMusicas("Forr�", "M�sicas para dan�ar se esfregando.");
		
		ComponenteMusical todasMusicasDesponiveis = new GrupoDeMusicas("Todas as Musicas", "Todas as m�sicas dispon�veis");
		
		todasMusicasDesponiveis.add(musicasClassica);
		todasMusicasDesponiveis.add(musicasHeavyMetal);
		todasMusicasDesponiveis.add(musicasForro);
		
		musicasClassica.add(new Musica("n�9", "Bethoven", 0000));
		musicasClassica.add(new Musica("The Entretainer", "Scott Joplin", 0000));
		
		Vitrola vitrola = new Vitrola(todasMusicasDesponiveis);
		
		vitrola.getListaDeMusicas();
	}
	
}
