package Prova1;

/*Escreva uma algoritmo que receba uma hora no formato de três números inteiros que
representam: horas, minutos e segundos. Sua função deve calcular e retornar a quantidade total de
segundos
 */
import java.util.Scanner;
public class atividade02 {
	public static void main(String[]args){
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe a hora com um numero:");
		byte receberHora = scanner.nextByte();
		System.out.println("Informe o minuto com um numero:");
		byte receberMinuto = scanner.nextByte();
		System.out.println("Informe o segundo com um numero:");
		byte receberSegundo = scanner.nextByte();
		
		//calculo 
		int horaEmSeg = (3600 * receberHora);
		int minutoEmSeg = (60 * receberMinuto);
		
		int total = horaEmSeg + minutoEmSeg + receberSegundo;
		
		System.out.println("O valor total de segundo é: " + total);
		
	}
}
