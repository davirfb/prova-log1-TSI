/* Crie um programa que leia uma sequência de números inteiros e exiba apenas os números
pares.*/
package Prova1;

import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        
        System.out.println("-Numeros pares e impares-");
        System.out.println("informe um numero limite:");
        int limite = scanner.nextInt();

        while(contador <= limite){
            contador++;
            if(contador%2==0){
                System.out.println(contador);
            }
        }
    }
}
