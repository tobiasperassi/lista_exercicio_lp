import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a;
        float b;
        System.out.println("Digite o número da variável A: ");
        a = in.nextFloat();
        System.out.println("Digite o número da variável B: ");
        b = in.nextFloat();

        System.out.println("Resultado da equação: " + (-b/a) );
    }
}