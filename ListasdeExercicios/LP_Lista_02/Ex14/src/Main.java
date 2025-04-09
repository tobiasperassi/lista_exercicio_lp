import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float base;
        float altura;
        System.out.print("Digite a altura do triângulo: ");
        altura = in.nextFloat();
        System.out.println("Digite a base do triângulo: ");
        base = in.nextFloat();

        System.out.println("Área do triângulo: " + base * altura / 2);
    }
}