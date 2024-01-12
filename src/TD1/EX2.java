package TD1;
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner S = new Scanner(System.in);
        a = S.nextInt();
        b = S.nextInt();
        c = S.nextInt();
        double D = Math.pow(b, 2) - (4 * a * c);
        if (D > 0) {
            System.out.println("l'equation admet deux solutions reels : x1=" + (-b - Math.sqrt(D) / 2 * a) + "  x2=" + (-b + Math.sqrt(D) / 2 * a));
        }
        if (D == 0) {
            System.out.println("l'equation admet une solutions  : x=" + (-b / 2 * a));
        }
        else {
            System.out.println("l'equation n'admet pas de solution reels");
        }
    }
}