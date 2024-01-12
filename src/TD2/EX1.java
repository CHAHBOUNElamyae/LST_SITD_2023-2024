package TD2;

public class EX1 {
    public static void main(String[] args){
            POINT p1=new POINT("a",5);
            p1.Affiche();
            p1.translat(2);
            p1.Affiche();
    }
}
class POINT {
    String nom;
    double abscisse;

    public POINT(String nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }


    public void Affiche() {
        System.out.println("le nom du point est: " + this.nom + " son abscisse est : " + this.abscisse);
    }

    public void translat(double dx) {
        abscisse = abscisse + dx;
    }
}