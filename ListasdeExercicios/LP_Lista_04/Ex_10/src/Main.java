import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int en;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        System.out.println("Digite o enésimo termo da sequência Fibonacci");
        en = in.nextInt();

        for (int i = 0; i<=en; i++){
            if (i == 0){
                System.out.println(n1 + ", ");
            } else if (i == 1) {
                System.out.println(n2 + ", ");
            } else {
                n3 = n1 + n2;
                System.out.println(n3 + ", ");
                n1 = n2;
                n2 = n3;
            }
        }
    }
}