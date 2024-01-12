package TD3;

public class EX1 {
    public static void main(String[] args){
    PointA a=new PointA(2,4);
    System.out.println(a.toString());
    a.deplace(2,2);
    System.out.println(a.toString());
    /* si la classe Point ne disposait pas des méthodes getX et getY alors on ne peut pas acceder
    * aux attribut (coordonnees)*/
    }
}
class Point{
    private int x;
    private int y;
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

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x =x+ dx;
        y =y+ dy;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
}
class PointA extends Point{
    PointA(int x, int y){
        super(x,y);
    }

    @Override
    public String toString() {
        return "le point A pour coordonnees x= " +this.getX()+" et y= "+this.getY();
    }
}