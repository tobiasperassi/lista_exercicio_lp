import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = in.nextInt();
        int contador = 0;

        for (int i = n1; i>0; i--){
            if (n1%i == 0){
                contador += 1;
            }
        }
        if (contador >= 2){
            System.out.println("Seu número não é primo!");
        } else {
            System.out.println("Seu número é primo!");
        }
    }
}