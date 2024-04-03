package lpa;

import java.util.Scanner;

public class Atividade3case {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 int mes;
		 
		 System.out.println ("informe o numero do mes de 1 a 12: ");
	     mes= ler.nextInt();
	     
	     switch(mes) {
	     case 1:
	    	 System.out.println("o mes escolhido foi: janeiro");
	    	 break;
	     case 2: 
	    	 System.out.println ("o mes escolhido foi: fevereiro");
	    	 break;
	     case 3:
	    	 System.out.println("o mes escolhido foi: março");
	    	 break;
	     case 4:
	    	 System.out.println("o mes escolhido foi: abril");
	     break;
	    
	     case 5:
	    	 System.out.println("o mes escolhido foi: maio");
	    	 break;
	     case 6:
	    	 System.out.println("o mes escolhido foi: junho");
	    	 break;
	     case 7:
	    	 System.out.println("o mes escolhido foi: julho");
	    	 break;
	     case 8:
	    	 System.out.println("o mes escolhido foi: agosto");
	    	 break;
	     case 9:
	    	 System.out.println("o mes escolhido foi: setembro");
	    	 break;
	     case 10:
	    	 System.out.println("o mes escolhido foi: outubro");
	    	 break;
	     case 11:
	    	 System.out.println("o mes escolhido foi: novembro");
	    	 break;
	     case 12:
	    	 System.out.println("o mes escolhido foi: dezembro");
	    	 break;
	    	
	     default:
	    		 System.out.println("o mes escolhido é invalido");
	    
	    	}

		}


	

	}
