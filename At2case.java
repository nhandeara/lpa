package lpa;

import java.util.Scanner;

public class At2case {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 int dia;
		 
		 System.out.println ("informe o dia da semana de 1 a 7: ");
	     dia= ler.nextInt();
	     
	     switch(dia) {
	     case 1:
	    	 System.out.println("o dia escolhido foi: domigo");
	    	 break;
	     case 2: 
	    	 System.out.println ("o dia escolhido foi: segunda");
	    	 break;
	     case 3:
	    	 System.out.println("o dia escolhido foi: terça");
	    	 break;
	     case 4:
	    	 System.out.println("o dia escolhido foi: quarta");
	     break;
	    
	     case 5:
	    	 System.out.println("o dia escolhido foi: quinta");
	    	 break;
	     case 6:
	    	 System.out.println("o dia escolhido foi: sexta");
	    	 break;
	     case 7:
	    	 System.out.println("o dia escolhido foi: sabado");
	    	 break;
	    	 
	    	 default:
	    		 System.out.println("o dia escolhido é invalido");
	    
	    	}

		}


	}


