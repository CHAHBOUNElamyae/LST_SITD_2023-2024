package TD1;
import java.util.Scanner;
public class EX8 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        int mois;
        do{
        System.out.print("Saisissez le numéro du mois (1 à 12) : ");
         mois = scanner.nextInt();}while (mois < 1 || mois > 12);
        int nbrJours;
        switch (mois) {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                nbrJours = 31;
                System.out.println("Le mois " + mois + " a " + nbrJours + " jours.");
                break;
            case 4: case 6: case 9: case 11:
                nbrJours = 30;
                System.out.println("Le mois " + mois + " a " + nbrJours + " jours.");
                break;
            case 2:
                System.out.print("Saisissez l'année (1900 à 2100) : ");
                int annee = scanner.nextInt();
                while(annee < 1900 || annee > 2100){
                    System.out.println("Année invalide. veullez saisire une annee >=1900 et <=2100");
                }
                if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)){
                    nbrJours=29;
                    System.out.println("Le mois " + mois + " a " + nbrJours + " jours.");
                }
                else{
                    nbrJours=28;
                    System.out.println("Le mois " + mois + " a " + nbrJours + " jours.");
                }
            default:
                System.out.println("Numéro de mois invalide. Le programme se termine.");
                break;
        }
    }
}
