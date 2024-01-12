package TD1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1Tableaux {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Saisissez un entier N : ");
        int N = S.nextInt();
        int max=0,min=0;
        int[] T = new int[N];
        System.out.println("inserer les elements du tableau : ");
        for (int i = 0; i < N; i++) {
            T[i] = S.nextInt();
        }
        for (int i = 0; i < T.length; i++) {
            System.out.print(T[i] +"||");
        }
        System.out.println();
        for (int i = 0; i < T.length; i++) {
            if(max<T[i]){
                max=T[i];
            }
            if(min>T[i]){
                min=T[i];
            }
        }
        System.out.println("le max dans le tableau est : "+max+" le min est :"+min);
    }
}
