import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1,n2,media;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        n1 = in.nextDouble();
        System.out.println("Digite a segunda nota");
        n2 = in.nextDouble();

        media =(n1+n2)/2;
        System.out.println("A média é:"+media);

        if (media>=8.5) {
            System.out.println("Parabéns! Você ficou com A");
        } else if(media>7 && media<8.5) {
            System.out.println("Você ficou com B");
        } else if (media>=5 && media<7) {
            System.out.println("Você ficou com C");
        }else {
            System.out.println("Você ficou com D");
        }
    }
}