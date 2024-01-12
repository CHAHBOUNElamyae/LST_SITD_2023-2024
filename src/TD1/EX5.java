package TD1;

import java.util.Scanner;

public class EX5 {
    static String langue;
    public static void main(String[] args){
        double h;

        Scanner S=new Scanner(System.in);
        do{
        System.out.println("choisire une langue:");
        langue=S.nextLine();}
        while((langue!="Fr")||(langue!="Ag"));
            if (langue == "Fr") {
                System.out.println("veullez saisir l'heur");
                h = S.nextDouble();
                if (h >= 0 || h < 18) {
                    System.out.println("Bonjour");
                }
                if (h >= 18 || h < 22) {
                    System.out.println("Bonsoir");
                }
                if (h >= 22) {
                    System.out.println("Bon nuit");
                }
            }
            if (langue=="Ag") {
                System.out.println("select your time");
                h = S.nextDouble();
                if (h >= 0 || h < 18) {
                    System.out.println("Good Morning");
                }
                if (h >= 18 || h < 22) {
                    System.out.println("Good Evening");
                }
                if (h >= 22) {
                    System.out.println("Good Night");
                }
            }

    }
}
