import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

 /* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
  */



public class calculoRaioDeUmCirculo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Locale LocaleUS = Locale.US;

        /* Formatação com ponto (Locale EUA)
        NumberFormat usFormat = NumberFormat.getCompactNumberInstance(LocaleUS);
        usFormat.setMinimumFractionDigits(4);*/

        System.out.printf("Digite o valor do raio de um círculo");
        double raio = sc.nextDouble();

        double area = 3.14159 * (raio * raio);



        System.out.printf("AREA: %.4f", area);
    }
}
