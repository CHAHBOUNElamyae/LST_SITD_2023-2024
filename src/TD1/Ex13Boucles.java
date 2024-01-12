package TD1;

import java.util.Scanner;

public class Ex13Boucles {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int a,b;
        int pgcd=1;
        do {
            System.out.print("Saisissez le premier entier positif non nul (a) : ");
            a = S.nextInt();
            System.out.print("Saisissez le deuxième entier positif non nul (b) : ");
            b = S.nextInt();
        }while(a <= 0 || b <= 0);
        if (b == 0) {
            System.out.println("la BGCD des deux nombres est :"+a);
        }
        else if (a==0) {
            System.out.println("la BGCD des deux nombres est :"+b);
        }
        else {
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    pgcd = i;
                }
            }
        }
        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);
    }
}
