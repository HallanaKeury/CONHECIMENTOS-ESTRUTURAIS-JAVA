import java.util.Scanner;

public class calculoTerreno {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite a largura do terreno: ");
        double width = scanner.nextDouble();

        System.out.println("Por favor digite o comprimento do terreno: ");
        double length = scanner.nextDouble();

        System.out.println("Por favor digite o valor do metro quadrado: ");
        double squareMeter = scanner.nextDouble();


        double area = width * length;
        double price = area * squareMeter;

        System.out.printf("A área total do terreno e o valor são respectivamente: %.2f e %.2f ", area, price  );

        scanner.close();
    }




}
