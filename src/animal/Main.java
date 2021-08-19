package animal;

public class Main {

	public static void main(String[] args) {
		
		Gato animal1 = new Gato("Coca", 20);
		Gato animal2 = new Gato("Foxy", 3);
		Cachorro animal3 = new Cachorro("Einstein", 10);
		Gato animal4 = new Gato("Edward", 5);
		
		System.out.println("Todos animais juntos consomem: "+(animal1.quantidadeDeRacao()+animal2.quantidadeDeRacao()+animal3.quantidadeDeRacao()+animal4.quantidadeDeRacao())+"kg");

	}

}
