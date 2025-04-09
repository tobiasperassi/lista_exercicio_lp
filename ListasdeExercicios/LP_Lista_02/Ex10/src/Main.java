import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float mil;
        System.out.print("Digite quantas milhas deseja converter: ");
        mil = in.nextFloat();

        System.out.println("Milhas em quilômetros: " + (mil*1.60934));
    }
}