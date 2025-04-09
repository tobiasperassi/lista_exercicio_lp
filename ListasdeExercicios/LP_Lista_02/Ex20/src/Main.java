import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float c, b, x1, x2;
        System.out.println("Digite a raiz 1: ");
        x1 = in.nextFloat();
        System.out.println("Digite a raiz 2: ");
        x2 = in.nextFloat();

        b = -(x1+x2);
        c = x1*x2;
        System.out.println("O valor de b é: " + b);
        System.out.println("O valor de c é: " + c);
    }
}
