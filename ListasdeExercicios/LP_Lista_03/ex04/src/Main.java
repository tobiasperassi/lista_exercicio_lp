import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double score1, score2, mean, recovery;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        score1 = in.nextDouble();

        System.out.println("Digite a segunda nota");
        score2 = in.nextDouble();

        mean = (score1 + score2)/2;
        System.out.println("Média = " +mean);

        if(mean>=50){
            System.out.println("Aprovado");
        }else{
            System.out.println("Informe a nota da recuperação");
            recovery = in.nextDouble();
            mean = (mean + recovery)/2;
            System.out.println("Média final =" +mean);

            if (mean>=50)
                System.out.println("Aprovado");
            else
                System.out.println("Reprovado");
        }

    }
}