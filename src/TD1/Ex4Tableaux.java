package TD1;

import java.util.Scanner;

public class Ex4Tableaux {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir la taille de la matrice carrée : ");
        //declaration de la taille et les deux matrices
        int taille = scanner.nextInt();
        int[][] matrice1 = new int[taille][taille];
        int[][] matrice2 = new int[taille][taille];
        // insertiondes elements des matrices
        System.out.println("Saisie les elements de la première matrice :");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print("Veuillez saisir l'élément [" + (i + 1) + "][" + (j + 1) + "] : ");
                matrice1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Saisie les elements de la deuxième matrice :");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print("Veuillez saisir l'élément [" + (i + 1) + "][" + (j + 1) + "] : ");
                matrice2[i][j] = scanner.nextInt();
            }
        }
        //affichage des deux matrices
        System.out.println("__________la matrice 1:___________");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(matrice1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("__________la matrice 2:___________");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print( matrice2[i][j]+" ");
            }
            System.out.println();
        }
        //calcule de la matrice somme
        int[][] sommeMatrices = new int[taille][taille];
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                sommeMatrices[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        //affichage de la matrice somme
        System.out.println("____________la matrice somme:___________");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(sommeMatrices[i][j]+" ");
            }
            System.out.println();
        }
    }
}
