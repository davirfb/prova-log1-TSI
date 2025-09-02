package Prova1;
/* Faça um programa que leia um caractere e indique se é uma vogal ou consoante.*/

import java.util.ArrayList;
import java.util.Scanner;

public class atividade05 {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("A");
        cars.add("E");
        cars.add("I");
        cars.add("O");
        cars.add("U");
        cars.add("a");
        cars.add("e");
        cars.add("i");
        cars.add("o");
        cars.add("u");
        System.out.println("Informe uma letra para verificar se é vogal ou não:");
        String letra = scanner.nextLine();
        
        if(letra == vogal){//erro
            System.out.println("A letra " + letra + " é uma vogal.");


        }else{
            System.out.println("A letra "+ letra + " não é uma vogal.");
        }
     
        
        
    }
}
