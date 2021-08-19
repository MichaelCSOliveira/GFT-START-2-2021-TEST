package idioma;

public class Main {

	public static void main(String[] args) {
		
		Portugues portugues = new Portugues ("Português");
		English english = new English ("Inglês");
		Magyar magyar = new Magyar ("Húngaro");
		Cestina cestina = new Cestina ("Tcheco");
		
		System.out.println(portugues.saudacao());
		System.out.println(english.saudacao());
		System.out.println(magyar.saudacao());
		System.out.println(cestina.saudacao());
		
	}

}
