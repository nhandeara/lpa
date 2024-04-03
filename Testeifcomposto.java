package lpa;

import java.util.Scanner;

public class Testeifcomposto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.print("informe o numero: ");
		numero= ler.nextInt();
		
		if (numero >0) {
			System.out.println("O numero é positivo");
		}
		else if (numero==0) {
			System.out.println("o numero é zero");
		}
		else {
			System.out.println("o numero é negativo");
		}
	ler.close();
	}

}
