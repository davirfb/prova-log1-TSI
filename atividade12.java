
package Prova1;

import java.util.Scanner;

/*Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média
((quantidade média = quantidade máxima + quantidade mínima) /2). Se a quantidade em estoque
for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a
mensagem 'Efetuar compra'. */
public class atividade12 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Infomre a quantidade atual em estoque:");
        int quantAtual = scanner.nextInt();
        System.out.println("Informe a quantidade máxima em estoque:");
        int quantMax = scanner.nextInt();
        System.out.println("Informe a quantidade mínima em estoque:");
        int quantMin = scanner.nextInt();

        int media = (quantMax + quantMin) / 2;

        if(quantAtual >= media){
            System.out.println("Não efetuar compra.");

        }else{
            System.out.println("Efetuar compra");
        }   

    }
}
