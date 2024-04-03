package lpa;

import java.util.Scanner;

public class At3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 
	     String turno;
		 
		 System.out.println ("Digite o turno: ");
	     turno= ler.nextLine();
	     
	     if(turno.equals("m")) {
	  System.out.println("Bom dia!");
	     }
	  
	     else if (turno.equals("v")) {
	    	System.out.println("Boa tarde");
	     }
	    	else if (turno.equals("n")) {
	    	System.out.println ("Boa noite!");
	    	}
	    	else {
	    		System.out.println("valor invalido");
	    	}
	     ler.close();
	}
}
