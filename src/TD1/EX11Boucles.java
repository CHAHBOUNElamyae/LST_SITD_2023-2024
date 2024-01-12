package TD1;

import java.util.Scanner;

public class EX11Boucles {
    public static void main(String[] args){
        int N;
        Scanner S=new Scanner(System.in);
        System.out.println("Entrer un entier naturelle N: ");
        N=S.nextInt();
        int Somme=0;
        for(int i=0;i<N;i++){
            if(i%2!=0){
                Somme=Somme+i;
            }
        }
        System.out.println("la somme des emtiers impaire inferieur a "+N+" est "+ Somme);
    }
}
