/*Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado
da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.*/
package Prova1;

import java.util.Scanner;

public class atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double valorGasolina = 3.30;
        Double valorAlcool = 2.90;
        Double valorPagar;

        System.out.println("Informe qual o tipo de gasolina (A=álcool,G=gasolina):");
        String tipoCompustivel = scanner.nextLine();
        System.out.println("Quantos litros");
        Double litragem = scanner.nextDouble();

        //verificar qual o tipo de gasolína
        if(tipoCompustivel.equals("A")){
            valorPagar = litragem * valorAlcool;
            System.out.printf("Total a pagar (Álcool): R$ %.2f%n", valorPagar);
        }
        else if(tipoCompustivel.equals("G")){
            valorPagar = litragem * valorGasolina;
            System.out.printf("Total a pagar (Gasolina): R$ %.2f%n", valorPagar);

        }else{
            System.out.println("Não foi informado o tipo da gasolína.");
        }



    }   
}
