package TD1;

import java.util.Scanner;

public class Ex18Boucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un nombre entier : ");
        int nombre = scanner.nextInt();
        int somme = 0;
        int copieNombre = Math.abs(nombre);

        while (copieNombre != 0) {
            somme += copieNombre % 10;
            copieNombre /= 10;
        }

        // Affichage du résultat
        System.out.println("La somme des chiffres de " + nombre + " est : " + somme);
    }
}
