package Prova1;

import java.util.Scanner;

/*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular
e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for
maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo
Negativo'. */
public class atividade11 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o débito: ");
        double debito = scanner.nextDouble();

        System.out.print("Digite o crédito: ");
        double credito = scanner.nextDouble();

        double saldoAtual = saldo - debito + credito; 

        System.out.println("\nNúmero da conta: " + conta);
        System.out.println("Saldo atual: " + saldoAtual);

        if(saldoAtual>= 0){
            System.out.println("Saldo positivo.");

        }else{
            System.out.println("saldo negativo.");
        }


       }
}
