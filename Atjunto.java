package lpa;
import java.util.Scanner;
public class Atjunto {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double salario,tempo,bonus;
		
		System.out.println("informe o salario:");
		salario=ler.nextDouble();
		
		System.out.println("informe anos de trabalho:");
		tempo = ler.nextDouble();
		
		if (tempo <= 3) {
		bonus = (salario*0.05);
		System.out.println("o valor do bonus é: "+ bonus);
		}
		else{
			bonus = (salario*0.07);
			System.out.println("o valor do bonus é:"+ bonus);
		}
		ler.close();
	}

}
