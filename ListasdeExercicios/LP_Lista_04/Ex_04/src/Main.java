import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = -80; i<=80; i++){
            System.out.println("Convertendo " + i + "°C para Fahrenheit + 10: " + (1.8*i+42));
        }
    }
}