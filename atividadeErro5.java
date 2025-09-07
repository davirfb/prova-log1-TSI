package Prova1;
/*Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem
os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do
jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. */

import java.util.Scanner;

public class atividadeErro5 {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Informe a hora(sem os minutos) que começou o jogo de xadrez:");
    int horaIni =  scanner.nextInt();
    System.out.println("Infomre a hora(sem os minutos) que acabou o jogo de xadrez:");
    int horaFim =  scanner.nextInt();   
    int duracao;
    
    if (horaFim > horaIni) {
            duracao = horaFim - horaIni;
        } else if (horaFim < horaIni) {
            duracao = 24 - (horaIni - horaFim);
        } else { 
            duracao = 24;
        }
     System.out.println("A duração do jogo foi de " + duracao + " hora(s).");

    scanner.close();
     }
}
