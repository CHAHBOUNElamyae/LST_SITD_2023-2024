package TD1;

public class Ex15Boucles {
    public static void main(String[] args){
        int total= 15;

        System.out.println("Combinaisons d'entiers entre 1 et 9" +
                " pour obtenir un total de " + total + ":");

        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= 9; j++)
            {
                for (int k = 1; k <= 9; k++)
                {
                    if (i + j + k == total)
                    {
                        System.out.println(i + " + " + j + " + " + k + " = " + total);
                    }
                }
            }
        }
    }
}
