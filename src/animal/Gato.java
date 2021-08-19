package animal;

public class Gato extends Animal{
	
	public Gato (String nome, double peso) {
		super(nome, peso);
	}
	
	public String som() {
		return "Miau!";
	}
	
	public double quantidadeDeRacao() {
		if (getPeso()<=4.0) {
			return 0.12*getPeso();
		} else if (getPeso()>4.00) {
			return 0.15*getPeso();
		}
		return 0;
	}
	
}
