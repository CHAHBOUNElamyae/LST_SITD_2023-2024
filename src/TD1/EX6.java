package TD1;
import java.util.Scanner;
public class EX6 {
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        int A=S.nextInt();
        int B=S.nextInt();
        if(A>0 && B>0){
            System.out.println("le preduit des deux nombres est positive");
        }
        else if(A>0 && B<0){
            System.out.println("le preduit des deux nombres est negative");
        }
        else if(A<0 && B>0){
            System.out.println("le preduit des deux nombres est negative");
        }
        if(A<0 && B<0){
            System.out.println("le preduit des deux nombres est positive");
        }
    }
}
