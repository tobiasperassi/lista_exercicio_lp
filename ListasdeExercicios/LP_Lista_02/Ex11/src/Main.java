import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float cel;
        float f;
        System.out.print("Digite graus Celsius deseja converter: ");
        cel = in.nextFloat();
        f = (cel*1.8f) + 32;

        System.out.println("Celsius em Fahrenheit: " + f);
    }
}