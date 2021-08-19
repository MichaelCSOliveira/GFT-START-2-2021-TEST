package notas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		
		String nome[] = {"Dó", "Ré", "Mi", "Fá", "Sol", "Lá", "Si"};
			
		System.out.print("Digite o número inicial: ");
		int init = reader.nextInt();
		System.out.print("Digite o número final: ");
		int fin = reader.nextInt();
		int rest = fin;
		while (rest>0) {
			for (int i = init; i <= 6; i++) {
				System.out.print(nome[i]+" ");
			}
		}

	}

}
