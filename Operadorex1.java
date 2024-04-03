package lpa;
import java.util.Scanner;
public class Operadorex1 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		System.out.println("informe a idade");
		int idade = ler.nextInt();
		
		
		String mensagem= idade >= 18 ? "maior de idade" : "Menor de idade";
		System.out.println(mensagem);// imprime "maior de idade"
		

	}

}
