import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = in.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = in.nextInt();

        int maior = 0;
        int menor = 0;

        if (n1>n2){
            maior = n1;
            menor = n2;
        } else if (n2>n1) {
            maior = n2;
            menor = n1;
        } else {
            System.out.println("Os números são iguais!");
        }

        System.out.println("Números entre os dois digitos: ");
        for (int i = menor + 1; i<maior; i++){
            System.out.println(i);
        }
    }
}