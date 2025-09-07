package Prova1;

import java.util.Scanner;

/*O custo de um carro novo ao consumidor é a soma do custo de fábrica coma porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do
distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica
de um carro, calcular e escrever o custo final ao consumidor. */
public class atividadeErro6 {
public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);

    System.out.println("-Calculando o valor do carro-\n");
    System.out.println("Informe o valor do custo de fábrica:");
    Double valorFabrica = scanner.nextDouble();

    //calculo das % do Distribuidor e Imposto
    Double parteDistribuidor = 0.28 * valorFabrica;
    Double parteImposto = 0.45 * valorFabrica;

    double valorFinal = parteDistribuidor + parteImposto + valorFabrica;

    String resultado = String.format("%.2f", valorFinal); 
    System.out.println(resultado);


}
}
