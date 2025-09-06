package Prova1;

import java.util.Scanner;

/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de
suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário
final do vendedor.*/
public class atividade07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de carros vendidos:");
        int quantidade = scanner.nextInt();
        System.out.println("Informe o valor total de suas vendas:");
        double valorVendas = scanner.nextFloat();
        System.out.println("Informe o valor do salário fixo:");
        double salario = scanner.nextFloat();
        System.out.println("Informe o valor recebido por carro vendido:");
        double valorPorCarro = scanner.nextFloat();

        double salarioFinal = salarioFixo + (valorPorCarro * quantidadeCarros) + (0.05 * valorTotalVendas);

        System.out.println("O seu salário é:" + calculo);

    }
}
