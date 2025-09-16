
package Prova1;

import java.util.Scanner;

/*Crie um programa que calcule o preço final de um produto com base em seu preço original
e em um desconto informado pelo usuário.*/
public class atividade14 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor do produto:");
     double valorOg = scanner.nextDouble();
    System.out.println("Digite o valor de desconto:");
     double valorDes= scanner.nextDouble();
    
    double valorFinal = valorOg - valorDes;
    
    System.out.println("Valor com desconto: " + valorFinal);
    


}
}
