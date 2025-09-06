package Prova1;

import java.util.Scanner;

/*Escreva um programa que determine se um ano é bissexto ou não.*/
// Regra para ano bissexto:
        // - divisível por 4 e não divisível por 100
        // OU divisível por 400
public class atividade08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe um ano: ");
            int ano = scanner.nextInt();

            if((ano%4 == 0 && ano%100 != 0)||(ano%400 ==0)){
                System.out.println("O ano é bissexto.");
            }else{
                System.out.println("O ano NÂO é bissexto.");
            }
        }
}
