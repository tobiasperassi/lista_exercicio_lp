import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número para fatorar: ");
        int n1 = in.nextInt();
        int soma = 1;

        for (int i = n1; i>0; i--){
            soma = soma * i;
        }
        System.out.println("O resultado do número fatorado é " + soma);
    }
}