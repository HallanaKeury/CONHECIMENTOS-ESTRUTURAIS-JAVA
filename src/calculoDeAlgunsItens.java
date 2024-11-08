/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar usando if/else ao invés de switch/case.
 */

import java.util.Scanner;

public class calculoDeAlgunsItens {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o codigo do item: ");
        int codigoItem = sc.nextInt();

        System.out.printf("Digite a quantidade de produtos:");
        int quantidade = sc.nextInt();

        double valor;

        if (codigoItem == 1){
            valor = quantidade * 4;
        } else if (codigoItem == 2) {
            valor = quantidade * 4.5;
        } else if (codigoItem == 3) {
            valor = quantidade * 5;
        } else if (codigoItem == 4) {
            valor = quantidade * 2;
        }else{
            valor = quantidade * 1.5;
        }

        System.out.printf("Valor total da compra: %.2f", valor);

        sc.close();

    }
}
