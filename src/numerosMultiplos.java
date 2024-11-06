
/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */

import java.util.Scanner;

public class numerosMultiplos {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Valor A: ");
        int A = sc.nextInt();

        System.out.printf("Valor B: ");
        int B = sc.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.printf("São multiplos ");
        }else{
            System.out.printf("Não são multiplos ");
        }

        sc.close();
    }
}
