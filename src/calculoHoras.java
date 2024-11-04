import java.util.Scanner;

/*
* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
* */

public class calculoHoras {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do usuario, o número de horas trabalhadas e o valor que recebe por hora:(separados por espaço) ");

        int usuario = sc.nextInt();
        double horasTrabalhadas = sc.nextDouble();
        double valorHora = sc.nextDouble();

        double calculoHoras = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER: %d%n SALARY: %.2f", usuario, calculoHoras);




    }
}
