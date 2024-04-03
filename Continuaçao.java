package lpa;

import java.util.Scanner;

public class Continuaçao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 
		String texto;
		
		System.out.println("informe o dia");
		texto = ler.nextLine();
		
		if (texto.equals("domingo")) {
			System.out.println ("dia 1");
		}
		else if (texto.equals("segunda")) {
			System.out.println("dia 2");
		}
		else if (texto.equals("terca")) {
			System.out.println ("dia 3");
		}
		else if (texto.equals("quarta")) {
			System.out.println ("dia 4");
		}
		else if (texto.equals("quinta")) {
			System.out.println("dia 5");
		}
		else if (texto.equals("sexta")) {
			System.out.println("dia 6");
		}
		else if (texto.equals("sabado")) {
		System.out.println ("dia 7");
	}
			else {
				System.out.println ("dia invalido");
			}
			ler.close();
		}
	}