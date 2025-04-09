import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float raio;
        float altura;
        System.out.print("Digite a altura do cone: ");
        altura = in.nextFloat();
        System.out.println("Digite o raio do cone: ");
        raio = in.nextFloat();

        System.out.println("Volume do cone: " + ((1.0f/3.0f)*3.14*(raio*raio)*altura));
    }
}