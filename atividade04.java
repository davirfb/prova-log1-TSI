package Prova1;
/* Receba a temperatura em graus Celsius, converta a temperatura para Fahrenheit utilizando a
fórmula F = (C * 9/5) + 32. Mostre a temperatura em graus Fahrenheit.
*/

import java.util.Scanner;

public class atividade04 {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe uma temperatura em Celsius:");
    Float cel = scanner.nextFloat();

    //calculo de Fahrenheit
    Float fahr = (cel * 9/5) + 32;

    System.out.println("A temperatura em fahrenheit:" + fahr + " F");
    }

}
