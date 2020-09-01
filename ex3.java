package array;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
Scanner valor = new Scanner (System.in);
 		
		int [] salario = new int [10];
		
		System.out.println("Digite 1º salário");
		salario[0]=valor.nextInt();
		System.out.println("Digite 2º salário");
		salario[1]=valor.nextInt();
		System.out.println("Digite 3º salário");
		salario[2]=valor.nextInt();
		System.out.println("Digite 4º salário");
		salario[3]=valor.nextInt();
		System.out.println("Digite 5º salário");
		salario[4]=valor.nextInt();
		System.out.println("Digite 6º salário");
		salario[5]=valor.nextInt();
		System.out.println("Digite 7º salário");
		salario[6]=valor.nextInt();
		System.out.println("Digite 8º salário");
		salario[7]=valor.nextInt();
		System.out.println("Digite 9º salário");
		salario[8]=valor.nextInt();
		System.out.println("Digite o 10º salário");
		salario[9]=valor.nextInt();
				
		
		int maival=0;
		for (int i=1; i<salario.length; i++) {
			
			if(salario[i] > salario[maival]);{
		maival=i;
		}

	}
		System.out.println("O maior salário é o número " +(maival+1)+".");
	}


	}


