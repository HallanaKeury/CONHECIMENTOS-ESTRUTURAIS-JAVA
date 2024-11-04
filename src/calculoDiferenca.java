import java.util.Scanner;

/*
* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
* */

public class calculoDiferenca {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int A = sc.nextInt();
        System.out.println("Digite o segundo valor");
        int B = sc.nextInt();
        System.out.println("Digite o terceiro valor");
        int C = sc.nextInt();
        System.out.println("Digite o quarto valor");
        int D = sc.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("DIFERENÇA " + diferenca);

    }
}
