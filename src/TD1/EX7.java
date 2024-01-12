package TD1;
import java.util.Scanner;
public class EX7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N;
        do{
            System.out.print("Saisissez un entier de trois chiffres non nuls : ");
            N = scanner.nextInt();
            } while(N < 100 && N > 999) ;
        String chiffres = Integer.toString(N);
        System.out.println("Les nombres formés par les chiffres de " + N + " sont : ");
        generatePermutations("", chiffres);
    }
    private static void generatePermutations(String prefix, String reste) {
        int n = reste.length();
        if (n == 0) {
            System.out.println(prefix);
        }
        else {
            for (int i = 0; i < n; i++)
            {
                generatePermutations(prefix + reste.charAt(i), reste.substring(0, i) + reste.substring(i + 1, n));
            }
        }
    }
}
