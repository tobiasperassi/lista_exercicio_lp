import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1;
        System.out.print("Digite um número: ");
        n1 = in.nextInt();
        System.out.println("O dobro desse número é: " + (n1*2));
    }
}