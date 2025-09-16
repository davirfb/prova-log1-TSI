
package Prova1;
/* Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se
formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor
que a soma dos outros 2 lados.
*/
public class atividade13 {
    public static void main(String[] args) {
          System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = sc.nextInt();

        //A < B + C
        //B < A + C
        //C < A + B 
        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }
    }
}
