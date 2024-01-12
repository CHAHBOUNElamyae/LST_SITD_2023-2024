package TD1;

import java.util.Scanner;

public class EX12Boucles {
    public static void main(String[] args){

        Scanner S = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int nombre,position=-1;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Saisissez le nombre #" + i + " : ");
            nombre = S.nextInt();
            if (nombre > maximum) {
                maximum = nombre;
                position=i;
            }
        }
        System.out.println("Le maximum parmi les 20 nombres est : " + maximum +"dans la position : "+ position);
    }
}
