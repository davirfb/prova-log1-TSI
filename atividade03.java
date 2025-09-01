package Prova1;
/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
*/
import java.util.Scanner;
public class atividade03 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        
          
        System.out.println("Informe qual o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.println("Em que ano você nasceu?");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        if(idade >= 18){
            System.out.println("Com sua idade " + idade + " é possível votar este ano.");
        }
        else{
            System.out.println("Com sua idade" + idade + " não é possível votar esse ano.");

        }


    }
}
