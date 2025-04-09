import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float vel_inicial;
        float aceleracao;
        float tempo;
        System.out.println("Digite a velocidade inicial: ");
        vel_inicial = in.nextFloat();
        System.out.println("Digite a aceleração: ");
        aceleracao = in.nextFloat();
        System.out.println("Digite o tempo de percurso: ");
        tempo = in.nextFloat();

        System.out.println("Velocidade: " + (aceleracao * tempo + vel_inicial));
    }
}