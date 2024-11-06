import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
public class numeroNegativo {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o valor: ");
        int valor = sc.nextInt();

        if(valor < 0){
            System.out.printf("Negativo ");
        }else{
            System.out.printf("Positivo ");
        }
    }
}
