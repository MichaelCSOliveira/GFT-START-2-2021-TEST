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
		int cont = 0;
		int i = init;
		while(i<=fin) {
			System.out.print(nome[i]+" ");
			cont++;
			if(i==6) {
				fin = fin - cont;
				i = -1;
			}
			i++;
		}

	}

}
