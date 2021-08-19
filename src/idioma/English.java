package idioma;

public class English extends Idioma{
	
	public English (String nomeDoIdioma) {
		super (nomeDoIdioma);
	}
	
	public String saudacao() {
		return getNomeDoIdioma() + ": Hello World";
	}
}