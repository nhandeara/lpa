package lpa;
import java.util.Scanner;
public class Operador3at {

	public static void main(String[] args) {
		double a;
       Scanner ler= new Scanner(System.in);
       System.out.print("informe um valor: ");
       a = ler.nextDouble();
       
       String mensagem= a % 5==0 ? "o numero " + a + " é multiplo de 5":"o numero "+ a +" não é multiplo de 5";
       System.out.println(mensagem);
	}

}
