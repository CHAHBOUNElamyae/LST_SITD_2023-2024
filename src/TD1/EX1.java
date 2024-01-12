package TD1;

import java.util.Scanner;
public class EX1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner S = new Scanner(System.in);
        a = S.nextInt();
        b = S.nextInt();
        c = S.nextInt();
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("la max est : " + max);
    }
}
