/*
* While é uma estrutura de controle que
repete um bloco de comandos
enquanto uma condição for
verdadeira.
Quando usar: quando não se
sabe previamente a quantidade
de repetições que será realizada.
*
* Fazer um programa que lê números
inteiros até que um zero seja lido. Ao
final mostra a soma dos números lidos
*
*  */


import java.util.Scanner;

public class somaAteZero {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0){
            soma = soma + x;
            x = sc.nextInt();
        }

        System.out.println(soma);
    }
}
