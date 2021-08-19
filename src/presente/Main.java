package presente;

import java.time.Year;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		System.out.println("---Presenteando o Funcionário---");
		System.out.println("Em que ano o funcionário entro na GFT?");
		int ano = reader.nextInt();
		int anoAtual = Year.now().getValue();
		int total = anoAtual - ano; 
		switch(total) {
			case 1:
				System.out.println("Receberá um vale presente!");
				break;
			case 2:
				System.out.println("Receberá um Smart Watch!");
				break;
			case 5:
				System.out.println("Receberá um Fone Bluetooth!");
				break;
			case 10:
				System.out.println("Receberá um Vale Jantar!");
				break;
			case 15:
				System.out.println("Receberá um Vale Jantar Top!");
				break;
			default: 
				if (total<0) { System.out.println("Isso é possível?");} else {
				System.out.println("Não receberá nada.");}
				break;
		}

	}

}
