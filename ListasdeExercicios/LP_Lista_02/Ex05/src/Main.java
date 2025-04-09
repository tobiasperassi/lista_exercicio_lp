import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float km;
        System.out.print("Digite quantos km/h deseja converter: ");
        km = in.nextFloat();
        System.out.println("Conversão em m/s: " + (km/3.6));
    }
}