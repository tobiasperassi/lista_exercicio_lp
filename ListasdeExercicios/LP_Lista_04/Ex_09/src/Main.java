import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;

        for (int i = 1; i<=10; i++){
            System.out.println(" ");
            System.out.println("Tabuada do " + i + ":");
            for (int n = 0; n<=10; n++){
                System.out.println("Qual o resultado de " + i + "x" + n + "?");
                n1 = in.nextInt();
                if (n1 == i*n){
                    System.out.println("Parabéns, você acertou!");
                } else {
                    System.out.println("Idivíduo com baixo inteléctuo detectado!");
                }
                System.out.println(i + "x" + n + "=" + i*n);
            }
        }
    }
}