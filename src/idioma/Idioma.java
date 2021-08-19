package idioma;

public abstract class Idioma {
	
	public Idioma(String nomeDoIdioma) {
		this.nomeDoIdioma = nomeDoIdioma;
	}
	
	private String nomeDoIdioma;
	
	public String getNomeDoIdioma() {
		return nomeDoIdioma;
	}

	public void setNomeDoIdioma(String nomeDoIdioma) {
		this.nomeDoIdioma = nomeDoIdioma;
	}

	abstract String saudacao();
}
