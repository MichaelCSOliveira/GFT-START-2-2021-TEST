package idioma;

public class Magyar extends Idioma{
	
	public Magyar (String nomeDoIdioma) {
		super (nomeDoIdioma);
	}
	
	public String saudacao() {
		return getNomeDoIdioma() + ": Helló Világ";
	}
}

