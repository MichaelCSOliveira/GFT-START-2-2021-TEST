package idioma;

public class Portugues extends Idioma{
	
	public Portugues (String nomeDoIdioma) {
		super (nomeDoIdioma);
	}
	
	public String saudacao() {
		return getNomeDoIdioma() + ": Olá Mundo";
	}
}
