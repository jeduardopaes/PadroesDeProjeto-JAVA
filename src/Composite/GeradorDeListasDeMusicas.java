package Composite;

public class GeradorDeListasDeMusicas {
	
	public static void main(String[] args) {
		
		ComponenteMusical musicasClassica = new GrupoDeMusicas("Classica", "Músicas para pessoas com muito dinheiro e com nível cultural considerado elevado.");
		
		
		ComponenteMusical musicasHeavyMetal = new GrupoDeMusicas("Heavy Metal", "Músicas para quem gosta de barulho e gritaria.");
		
		ComponenteMusical musicasForro = new GrupoDeMusicas("Forró", "Músicas para dançar se esfregando.");
		
		ComponenteMusical todasMusicasDesponiveis = new GrupoDeMusicas("Todas as Musicas", "Todas as músicas disponíveis");
		
		todasMusicasDesponiveis.add(musicasClassica);
		todasMusicasDesponiveis.add(musicasHeavyMetal);
		todasMusicasDesponiveis.add(musicasForro);
		
		musicasClassica.add(new Musica("nª9", "Bethoven", 0000));
		musicasClassica.add(new Musica("The Entretainer", "Scott Joplin", 0000));
		
		Vitrola vitrola = new Vitrola(todasMusicasDesponiveis);
		
		vitrola.getListaDeMusicas();
	}
	
}
