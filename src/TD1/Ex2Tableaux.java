package TD1;

import java.util.Scanner;

public class Ex2Tableaux {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int nombre;
        System.out.print("Veuillez saisir un entier N : ");
        nombre = S.nextInt();
        System.out.println("La représentation binaire de " + nombre + " est : "
                + Integer.toBinaryString(nombre));
    }
}
