import java.util.Scanner;

/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
public class duracaoJogo {
    public static void  main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe a hora do inicio do jogo");
        int horaInicio = sc.nextInt();
        System.out.printf("Informe a hora do fim do jogo");
        int horaFim = sc.nextInt();


        int duracaoJogo;


        if (horaFim > horaInicio){
            duracaoJogo = horaFim - horaInicio;
        } else { duracaoJogo = (24 - horaInicio) + horaFim;
        }

        if (duracaoJogo < 1 || duracaoJogo > 24) {
            System.out.println("O jogo precisa ter ao menos 1 hora e no máximo 24");
        }else

            System.out.printf("O Jogo durou %d horas", duracaoJogo);


        sc.close();
    }
}
