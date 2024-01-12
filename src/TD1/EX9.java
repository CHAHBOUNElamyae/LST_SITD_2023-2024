package TD1;
import java.util.Scanner;
public class EX9 {
    public static void main(String[] args){
        int temp,a,b;
        Scanner S=new Scanner(System.in);
        System.out.print("Saisissez la première variable : ");
         a = S.nextInt();
        System.out.print("Saisissez la deuxième variable : ");
        b = S.nextInt();
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Les variables dans l'ordre croissant sont : " + a + ", " + b);
    }
}