import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i<=200; i++){
            if (i%4==0){
                System.out.println("O número " + i + " é divisível por 4!");
            }
        }
    }
}