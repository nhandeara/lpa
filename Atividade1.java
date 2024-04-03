package lpa;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		String texto1, texto2;
		int tamanho;
		char posicao;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("informe a texto1: ");
		texto1 = ler.nextLine();
		
		tamanho = texto1.length(); 
		System.out.println ("tamanho do texto1: " + tamanho);
		
		posicao = texto1.charAt(3);
		System.out.println ("A posicao é: " + posicao);
		
		System.out.println ("informe o segundo texto2: ");
		texto2 = ler.nextLine();
		
		if (texto1.equals(texto2)) {
			System.out.println("os textos sao iguais");
		}
		
		
		
		
		
		
		
		
				

		

	}

}
