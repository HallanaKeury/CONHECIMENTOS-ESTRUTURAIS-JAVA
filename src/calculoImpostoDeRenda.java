/*
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

De 00,00 a 2,000 - insento
De 2000,01 a 3,000 - 8%
De 3000,01 a 4,500 - 18%
acima de 4,500 - 28%

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
 */


import java.util.Scanner;

public class calculoImpostoDeRenda {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite seu salário: ");
        double salario = sc.nextDouble();

        double calculo=0;

        double imposto8 = 80;
        double imposto18 = 270;



        if (salario >= 0 && salario <= 2000.00){
            System.out.printf("Insento de imposto ");
        } else if (salario > 2000.00 && salario <= 3000.00) {
            calculo = (salario  - 2000.00 ) * 0.08;
        } else if (salario > 3000.00 && salario <= 4500.00) {
            calculo = (salario - 3000) * 0.18 + imposto8;
        } else if (salario > 4500.00) {
            calculo = (salario - 4500) * 0.28 + imposto8 + imposto18;
        }

        System.out.printf("RS %.2f ", calculo);
        


        sc.close();
    }
}
