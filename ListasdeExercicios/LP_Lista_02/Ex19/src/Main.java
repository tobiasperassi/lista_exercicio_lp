import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a;
        float b;
        float c;
        double raiz;
        double valor1, valor2;
        System.out.print("Digite o número da variável A: ");
        a = in.nextFloat();
        System.out.print("Digite o número da variável B: ");
        b = in.nextFloat();
        System.out.print("Digite o número da variável C: ");
        c = in.nextFloat();

        raiz = Math.sqrt((b * b) - (4 * a * c));
        valor1 = (-b+raiz) / (2*a);
        valor2 = (-b-raiz) / (2*a);


        System.out.println("Resultado 1 da equação: " + valor1);
        System.out.println("Resultado 2 da equação: " + valor2);
    }
}