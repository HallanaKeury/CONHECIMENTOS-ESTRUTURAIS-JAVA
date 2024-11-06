import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
public class parOuImpar {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o valor");
        int valor = sc.nextInt();

        if(valor % 2  == 0){
            System.out.printf("Numero par");
        }else{
            System.out.printf("Numero impar");
        }

        sc.close();
    }
}
