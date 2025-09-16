package Prova1;

import java.util.Scanner;

/*Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever se
existem números repetidos no vetor VET e em que posições se encontram. */
public class atividade66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]vet = new int[50];

        //Lendo os 50 números
        for(int i = 0;i < vet.length;i++){
            System.out.println("Digite o número da posição " + i + ": ");
            vet[i] = scanner.nextInt();
        }

        boolean existeRepeticao = false;

        //Verificação de números repetidos
        for(int i = 0; i < vet.length; i++){
            for(int j = i + 1;j < vet.length;j++){
                if(vet[i]==vet[j]){
                    System.out.println("O número "+ vet[i] + "repetido nas posições: " + i + " e " + j );
                    existeRepeticao = true;
                }

            }

        }
        if(existeRepeticao == false){
            System.out.println("Não existem repetições no vetor.");

        }


    }
}
