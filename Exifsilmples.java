package lpa;

import java.util.Scanner;

public class Exifsilmples {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.print("informe o numero: ");
		numero= ler.nextInt();
		
		if (numero > 10) {
			System.out.println("o numero é maior que 10");
		}
		ler.close();
		
	}

	}

