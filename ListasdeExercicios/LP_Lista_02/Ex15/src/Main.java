import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float raio;
        float altura;
        System.out.print("Digite a altura do cilindro: ");
        altura = in.nextFloat();
        System.out.println("Digite o raio do cilindro: ");
        raio = in.nextFloat();

        System.out.println("Volume do cilindro: " + (3.14 * (raio*raio) * altura));
    }
}