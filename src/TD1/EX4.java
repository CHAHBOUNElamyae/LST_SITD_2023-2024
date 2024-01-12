package TD1;
import java.util.Scanner;
public class EX4 {
    public static void main(String[] args){
        double Moyenne;
        Scanner S=new Scanner(System.in);
        do{
            System.out.println("veillez entrer la moyenne :");
            Moyenne=S.nextDouble();}
        while( Moyenne<0 || Moyenne>20);
        if(Moyenne>=10 && Moyenne<12){
            System.out.println("mention Passable");
        }
        if(Moyenne>=12 && Moyenne<14){
            System.out.println("mention A.Bien");
        }
        if(Moyenne>=14 && Moyenne<16){
            System.out.println("mention Bien");
        }
        if(Moyenne>=16){
            System.out.println("mention T.Bien");
        }
        else{
            System.out.println("non valide");
        }
    }
}
