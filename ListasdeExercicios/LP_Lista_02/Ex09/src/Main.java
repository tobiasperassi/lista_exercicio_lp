import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float km;
        System.out.print("Digite quantos quilômetros deseja converter: ");
        km = in.nextFloat();

        System.out.println("Quilômetros para milhas: " + (km*0.621371));
    }
}