package TD1;
import java.util.Scanner;
public class EX3 {
    public static void main(String[] args){
        int a,b;
        Scanner S=new Scanner(System.in);
        a=S.nextInt();
        b=S.nextInt();
        int p=a*b;
        int s=a+b;
        if(s%2==0){
            System.out.println("la somme des deux entiers est paire");
        }
        else{
            System.out.println("la somme des deux entiers est impaire");
        }
        if(p%2==0){
            System.out.println("le produits des deux entiers est paire");
        }
        else{
            System.out.println("le produits des deux entiers est impaire");
        }
        if(s>0){
            System.out.println("la somme des deux nombre est positif");
        }
        else if(s<0){
            System.out.println("la somme des deux nombre est negatif");
        }
        else{
            System.out.println("la somme des deux nombre est null");
        }
        if(p>0){
            System.out.println("le produits des deux nombre est positif");
        }
        else if(p<0){
            System.out.println("le produits des deux nombre est negatif");
        }
        else{
            System.out.println("le produits des deux nombre est null");
        }
    }
}
