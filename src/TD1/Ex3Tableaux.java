package TD1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex3Tableaux {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Veuillez saisir le nombre d'étudiants : ");
        int nombreEtudiants = S.nextInt();
        double[] moyennes = new double[nombreEtudiants];
        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.print("Veuillez saisir la moyenne de l'étudiant " + (i + 1) + " : ");
            moyennes[i] = S.nextDouble();
        }
        System.out.print("Veuillez saisir le seuil : ");
        double seuil = S.nextDouble();
        int compte = 0;
        for (double moyenne : moyennes) {
            if (moyenne >= seuil) {
                compte++;
            }
        }
        System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale à " + seuil + " est : " + compte);
    }
}
