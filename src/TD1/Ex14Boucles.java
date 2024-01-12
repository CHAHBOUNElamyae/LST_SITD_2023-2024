package TD1;

import java.util.Scanner;

public class Ex14Boucles {
    public static void main(String[] args){
           int n;
            Scanner S=new Scanner(System.in);
            do{
                System.out.print("Saisissez un entier positif n : ");
                n = S.nextInt();
            }while(n < 0);
                long a = 0;
                long b = 1;
                for (int i = 2; i <= n; i++) {
                    long temp = a + b;
                    a = b;
                    b = temp;
                }
                System.out.println("Le " + n + "ème terme de la suite de Fibonacci est : " + b);
            }
}
