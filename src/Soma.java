import java.util.Scanner;

/*
* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa
* */

public class Soma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digit o primeiro valor: ");
        int  num1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.printf("SOMA: %d", soma);


    }
}
