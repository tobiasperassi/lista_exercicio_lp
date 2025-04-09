import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float raio;
        System.out.println("Digite o raio de um círculo: ");
        raio = in.nextFloat();
        System.out.println("A área desse círculo é igual a: " + (3.14 * (raio*raio)));
    }
}