import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float n1;
        float n2;
        System.out.println("Digite a nota com peso 1: ");
        n1 = in.nextFloat();
        System.out.println("Digite a nota com peso 2: ");
        n2 = in.nextFloat();

        System.out.println("A média entre as duas notas é: " + (n1 + n2*2)/3);
    }
}