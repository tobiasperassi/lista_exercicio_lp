import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float mm;
        System.out.print("Digite quantos milímetros deseja converter: ");
        mm = in.nextFloat();

        System.out.println("Milímrtros para polegadas: " + (mm/25.4));
    }
}