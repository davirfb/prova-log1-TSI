/*Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o
nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE. */
package Prova1;

import java.util.Scanner;

public class atividade15 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nome do primeiro time:");
    String nome1 = scanner.nextLine();
    System.out.println("Nome do segundo time:");
    String nome2 = scanner.nextLine();

    System.out.println("Quantos gols o time " + nome1 + " foram feitos?");
    int gols1 = scanner.nextInt();
    System.out.println("Quantos gols o time " + nome2 + " foram feitos?");
    int gols2 = scanner.nextInt();

    if(gols1 > gols2){
        System.out.println("O time " + nome1 + " é o vencedor.");
    }
    else if(gols2 > gols1){
        System.out.println("O time " + nome2 + " é o vencedor.");
    }
    else{
        System.out.println("O jogo deu empate.");
    }

    
 }
}
