import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float pol;
        System.out.print("Digite quantas polegadas deseja converter: ");
        pol = in.nextFloat();

        System.out.println("Polegadas para milímetros: " + (pol*25.4));
    }
}