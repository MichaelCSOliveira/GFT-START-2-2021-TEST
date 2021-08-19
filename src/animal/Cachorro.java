package animal;

public class Cachorro extends Animal {
	
	public Cachorro (String nome, double peso) {
		super(nome, peso);
	}
	
	public String som() {
		return "Auau!";
	}
	
	public double quantidadeDeRacao() {
		if (getPeso()<=3.0) {
			return 0.35*getPeso();
		} else if (getPeso()>3.0 && getPeso()<=10) {
			return 0.45*getPeso();
		} else if (getPeso()>10) {
			return 0.5*getPeso();
		}
		return 0;
	}

}
