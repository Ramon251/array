package array;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
Scanner valor = new Scanner (System.in);
 		
		int [] salario = new int [10];
		
		System.out.println("Digite 1� sal�rio");
		salario[0]=valor.nextInt();
		System.out.println("Digite 2� sal�rio");
		salario[1]=valor.nextInt();
		System.out.println("Digite 3� sal�rio");
		salario[2]=valor.nextInt();
		System.out.println("Digite 4� sal�rio");
		salario[3]=valor.nextInt();
		System.out.println("Digite 5� sal�rio");
		salario[4]=valor.nextInt();
		System.out.println("Digite 6� sal�rio");
		salario[5]=valor.nextInt();
		System.out.println("Digite 7� sal�rio");
		salario[6]=valor.nextInt();
		System.out.println("Digite 8� sal�rio");
		salario[7]=valor.nextInt();
		System.out.println("Digite 9� sal�rio");
		salario[8]=valor.nextInt();
		System.out.println("Digite o 10� sal�rio");
		salario[9]=valor.nextInt();
				
		
		int maival=0;
		for (int i=1; i<salario.length; i++) {
			
			if(salario[i] > salario[maival]);{
		maival=i;
		}

	}
		System.out.println("O maior sal�rio � o n�mero " +(maival+1)+".");
	}


	}


