package TD1;

import java.util.Scanner;

public class Ex5Tableaux {
    public static void main(String[] args) {
        char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};
        System.out.println("Tableau initial :");
        for(int i=0;i< tableau.length;i++){
            System.out.print(tableau[i] +"|");
        }
        // Décaler les éléments vers la gauche
        for (int i = 0; i < tableau.length - 1; i++) {
            tableau[i] = tableau[i + 1];
        }
        tableau[tableau.length - 1] = tableau[0];
        // Affichage du tableau modifié
        System.out.println("\nTableau modifié :");
        for(int i=0;i< tableau.length;i++){
            System.out.print(tableau[i] +"|");
        }
    }
}
