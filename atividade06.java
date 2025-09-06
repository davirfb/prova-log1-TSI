package Prova1;

import java.util.Scanner;

/* Crie um programa que calcule o valor total a ser pago em uma conta de restaurante,
considerando o valor da refeição e uma taxa de serviço.
*/
public class atividade06 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conta no restaurante\n \nInforme o valor da refeição:");
        float refeicao = scanner.nextFloat();
        System.out.println("\nInforme o valor da taxa de serviço:");
        float taxa = scanner.nextInt();

        float calculo = (taxa/100) * refeicao;

        float total = calculo + refeicao;

        System.out.println("Valor de taxa:\n"+calculo+"\nTotal: " + total);

  
    }

}
