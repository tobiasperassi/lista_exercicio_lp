import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i<=10; i++){
            System.out.println(" ");
            System.out.println("Tabuada do " + i + ":");
            for (int n = 0; n<=10; n++){
                System.out.println(i + "x" + n + "=" + i*n);
            }
        }
    }
}