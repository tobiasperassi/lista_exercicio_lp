import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double n,sqrt;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número real:");
        n = in.nextDouble();

        if (n>0){
            sqrt = Math.sqrt(n);
            System.out.println("A raiz quadrada de " +n +"é:" + sqrt);
        }
        else {
            System.out.println("A raiz quadrada não existe");
        }
    }
}