import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n1 = in.nextInt();

        for(int i = 0; i < 11; i++){
            System.out.println(n1 + "x" + i + "=" + (n1*i));
        }
    }
}