import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
public class calculoProduto {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("PEÇA 1: Digite o código, o numero de peças e o valor unitário (Separado por espaço )");
        System.out.println("PEÇA 2: Digite o código, o numero de peças e o valor unitário (Separado por espaço )");

        int cod1 = sc.nextInt();
        int num1 = sc.nextInt();
        double valor1 = sc.nextDouble();
        int cod2 = sc.nextInt();
        int num2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double calculoProduto1 = valor1 * num1;
        double calculoProduto2 = valor2 * num2;
        double valorASerPago = calculoProduto1 + calculoProduto2;

        //formato %.2f foi alterado por causa do scanner
        System.out.printf("O valor a ser pago é: %.2f", valorASerPago);


    }
}
