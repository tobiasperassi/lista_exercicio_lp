import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valor;
        int forma;
        int parcelas;
        double total;

        System.out.println("Insira o valor da compra: ");
        valor = in.nextDouble();

        System.out.println("----------------------------------");

        System.out.println("Menu:");
        System.out.println("1. Débito");
        System.out.println("2. Pix");
        System.out.println("3. Crédito");

        System.out.println("----------------------------------");

        System.out.println("Escolha uma forma de pagamento: ");
        forma = in.nextInt();

        if (forma == 1){
            System.out.println("Débito Selecionado");
            valor = valor - (valor * 0.05);
        } else if (forma == 2) {
            System.out.println("Pix Selecionado");
            valor = valor - (valor * 0.1);
        } else if (forma == 3) {
            System.out.println("Crédito Selecionado");
        } else {
            System.out.println("Pagamento inválido!");
        }
        System.out.println("----------------------------------");

        System.out.println("Escolha o número de parcelas: ");
        parcelas = in.nextInt();

        if (forma == 3 && parcelas <= 4){
            valor = valor + (valor * 0.02);
        } else if (forma == 3 && parcelas >= 5 && parcelas <= 10) {
            valor = valor + (valor * 0.05);
        } else if (forma == 3 && parcelas > 10) {
            System.out.println("Seu duro! O número de parcelas só vai até 10!");
        }

        total = valor / parcelas;

        System.out.println("Valor final da compra: " + valor);
    }
}