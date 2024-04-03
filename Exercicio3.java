package lpa;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 
     int dia;
	 
	 System.out.println ("informe o dia: ");
     dia= ler.nextInt();
     
     if(dia== 1) {
  System.out.println("domingo");
     }
   
     else if (dia== 2) {
    	System.out.println("segunda");
     }
    	else if (dia== 3) {
    	System.out.println ("terca feira");
    	}
    	else if (dia== 4) {
        System.out.println ("quarta feira");
    	}
    	else if (dia== 5) {
    		System.out.println ("quinta feira");
    	}
    	else if (dia== 6) {
    		System.out.println ("sexta feira");
    	}
    	else if (dia== 7) {
    		System.out.println ("sabado");
    	}
    	else{
    		System.out.println ("dianovo");
    	}
     ler.close();
     
    	}

	}


