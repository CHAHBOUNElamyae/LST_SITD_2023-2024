package TD2;

public class EX5 {
    public static void main(String[] args){
        Rectangle R=new Rectangle(9,3);
        System.out.println(R.toString());
        System.out.println("l'aire du rectangle est :"+ R.Aire());
        System.out.println("le perimetre du rectangle est :"+R.Perimetre());
        if(R.IsCarre()){
            System.out.println("le rectangle est un carre");
        }
        else{
            System.out.println("le rectangle n'est pas un carre");
        }
    }
}
class Rectangle{
    private int longeure;
    private int largeure;

    public int getLongeure() {
        return longeure;
    }

    public void setLongeure(int longeure) {
        this.longeure = longeure;
    }

    public int getLargeure() {
        return largeure;
    }

    public void setLargeure(int largeure) {
        this.largeure = largeure;
    }

    public Rectangle(int longeure,int largeure){
        this.longeure=longeure;
        this.largeure=largeure;
    }
    public Rectangle (Rectangle rectangle){
        this(rectangle.getLongeure(),rectangle.getLargeure());

    }
    public double Perimetre(){
        return 2*(longeure+largeure);
    }
    public double Aire(){
        return longeure*largeure;
    }
    public boolean IsCarre(){
        return  largeure == longeure;
    }

    @Override
    public String toString() {
        return "le rectangle a " + " une longeure= " + longeure +" et une largeure= " + largeure ;
    }
}