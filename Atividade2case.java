package lpa;

import java.util.Scanner;

public class Atividade2case {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 String dia;
		 
		 System.out.println ("informe o dia da semana de domigo a sabado: ");
	     dia= ler.next();
	     
	     switch(dia) {
	     case "domigo":
	    	 System.out.println("o dia escolhido foi: 1");
	    	 break;
	     case "segunda": 
	    	 System.out.println ("o dia escolhido foi: 2");
	    	 break;
	     case "terca":
	    	 System.out.println("o dia escolhido foi: 3");
	    	 break;
	     case "quarta":
	    	 System.out.println("o dia escolhido foi: 4");
	     break;
	    
	     case "quinta":
	    	 System.out.println("o dia escolhido foi: 5");
	    	 break;
	     case "sexta":
	    	 System.out.println("o dia escolhido foi: 6");
	    	 break;
	     case "sabado":
	    	 System.out.println("o dia escolhido foi: 7");
	    	 break;
	    	 
	    	 default:
	    		 System.out.println("o dia escolhido é invalido");
	    
	    	}

		}



		

	}

