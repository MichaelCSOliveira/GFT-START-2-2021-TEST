package idioma;

public class Cestina extends Idioma{
	
	public Cestina (String nomeDoIdioma) {
		super (nomeDoIdioma);
	}
	
	public String saudacao() {
		return getNomeDoIdioma() + ": Ahoj Svete";
	}
}
