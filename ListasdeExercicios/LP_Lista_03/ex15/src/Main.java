import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       float valor;
       int opcao;

       Scanner in = new Scanner(System.in);
       System.out.println("Insira o dinheiro: ");
       valor = in.nextFloat();

        System.out.println("----------------------------------");

        System.out.println("1. Café Expresso R$ 0,50");
        System.out.println("2. Café Longo R$ 1,00");
        System.out.println("3. Capuccino R$ 2,50");
        System.out.println("4. Chocolate R$ 2,00");

        System.out.println("----------------------------------");

        System.out.println("Escolha uma opção: ");
        opcao = in.nextInt();

        System.out.println("----------------------------------");

        if (opcao == 1){
            System.out.println("Bebida selecionada: Café Expresso");
            System.out.println("Seu troco: " + (valor - 0.5));
        } else if (opcao == 2) {
            System.out.println("Bebida selecionada: Café Longo");
            System.out.println("Seu troco: " + (valor - 1.0));
        } else if (opcao == 3) {
            System.out.println("Bebida selecionada: Capuccino");
            System.out.println("Seu troco: " + (valor - 2.5));
        } else if (opcao == 4) {
            System.out.println("Bebida selecionada: Chocolate");
            System.out.println("Seu troco: R$" + (valor - 2.0));
        } else {
            System.out.println("Digite uma opção ou um número válido");
        }
    }
}
