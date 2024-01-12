package TD1;

public class Ex19Boucles {
    public static void main(String[] args) {
        System.out.println("Entiers cubiques de trois chiffres :");
        for (int i = 100; i < 1000; i++) {
            int nombre = i;
            int sommeCubes = 0;

            while (nombre != 0) {
                int chiffre = nombre % 10;
                sommeCubes += Math.pow(chiffre, 3);
                nombre /= 10;
            }

            if (sommeCubes == i) {
                System.out.println(i);
            }
        }
    }
}
