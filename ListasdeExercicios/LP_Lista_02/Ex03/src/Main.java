import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float n1;
        System.out.print("Digite um número: ");
        n1 = in.nextFloat();
        System.out.println("A quinta parte do número digitado é: " + (n1/5));
    }
}