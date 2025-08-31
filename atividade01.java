
//Crie um algoritmo que receba o salário de um empregado e o percentual de aumento, calcule e
//mostre o valor do aumento e o novo salário.

package Prova1;
import java.util.Scanner;
 class atividade01 {
	public static void main (String[]args) {
		Scanner obj = new Scanner (System.in);
		
		//informando o salário 
		System.out.println("Informe seu salário:");
		float salario = obj.nextFloat();
		
		
		//informando o percentual de aumento
		System.out.println("Informe seu percentual de aumento:");
		float pAumento = obj.nextFloat();
		
		float valorAumento = salario * (pAumento/100);
		float novoSalario = salario + valorAumento;
		
		System.out.println("O seu novo salário é: " + novoSalario);
		
	}
}
