import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float ms;
        System.out.println("Digite quantos km/h deseja converter: ");
        ms = in.nextFloat();
        System.out.println("Conversão em km/h: " + (ms*3.6));
    }
}