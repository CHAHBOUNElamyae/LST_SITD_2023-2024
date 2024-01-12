package TD2;

public class EX2 {
    public static void main(String[] args){
    Point A=new Point();
    A.setNom("A");
    A.setX(3);
    A.setY(2);
    System.out.println(A.getX()+","+A.getY()+","+A.getNom());
    System.out.println("la norme du point est : "+A.norme());
    }
}
class Point{
    private int x;
    private int y;
    String nom;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public double norme(){
        double n=Math.sqrt(x*x + Math.pow(this.getY(),2));
        return n;
    }

    @Override
    public String toString() {
        return "le point "+this.getNom()+"ses coordonnees sont x="+this.getX()+" y="+this.getY();
    }
}
