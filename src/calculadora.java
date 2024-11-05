import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Entre com o primeiro valor: ");
        double num1 = scanner.nextDouble();

        System.out.println("Entre com o segundo valor: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação entre: + - * /");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation){
            case'+' -> result = num1 + num2;
            case'-' -> result = num1 - num2;
            case'*' -> result = num1 * num2;
            case'/' ->{
                if (num2 != 0){
                    result = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é aceita. ");
                    return;
                }
            }

        }

        System.out.printf("O resultado é %s " , result);
    }
}
