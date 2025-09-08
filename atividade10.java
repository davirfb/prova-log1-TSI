package Prova1;
/*Crie um programa que verifique se um caractere inserido pelo usuário é uma letra
maiúscula ou minúscula.*/

import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        String entrada = scanner.nextLine();

        char letra = entrada.charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("A letra " + letra + " está em maiúsculo.");
        }else{
            System.out.println("A letra " + letra + " está em minúsculo.");
        }

        scanner.close();
    }
}