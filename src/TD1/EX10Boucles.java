package TD1;
import java.util.Scanner;
public class EX10Boucles {
    public static void main(String[] args) {
        int N, FactN = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Saisissez un entier naturel N : ");
            N = scanner.nextInt();
        } while (N < 0);
        if (N == 0 || N == 1) {
            System.out.println("le factorielle de " + N + "est : 1");
        }
        else {
                FactN = 1;
                for (int i = 1; i <= N; i++) {
                    FactN *= i;
                }
                System.out.println("le factorielle de " + N + "est : "+FactN);
        }
    }
}
