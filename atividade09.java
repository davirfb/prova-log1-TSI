package Prova1;

import java.util.Scanner;

/*Faça um programa que determine se um número é múltiplo de 5*/
public class atividade09 {
public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Digite um número para verificar se é múltiplo de 5:");
    int numero = scanner.nextInt();
    if(numero%5==0){
        System.out.println("O numero " + numero + " é múltiplo de 5.");


    }else{
        System.out.println("O numero " + numero + " não múltiplo de 5.");
    }
}
}
