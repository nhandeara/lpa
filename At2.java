package lpa;

import java.util.Scanner;

public class At2 {

	public static void main(String[] args) {
        Scanner ler =new Scanner (System.in);
		
		String L, S;
		String login, senha;
		
		
		System.out.println("Cadastre seu login: ");
		login= ler.next();
		
		System.out.println("cadastre sua senha: ");
		senha= ler.next();
		
		System.out.println("o cadastro foi realizadop com sucesso");
		
		
		System.out.println("informe o login");
		L = ler.next();
		
		System.out.println("informe a senha");
		S = ler.next();
		
		if(L.equals(login)&& S.equals(senha)){
			System.out.println("bem vindo ao sistema senai");
			
		}
		else {
			System.out.println("dadaos incorretos informe o valor novamente");
		}
		ler.close();
				
		

	}

}