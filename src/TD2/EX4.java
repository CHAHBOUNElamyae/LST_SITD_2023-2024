package TD2;

public class EX4 {
    public static void main(String[] args){
        Temps T1=new Temps(12,6,40);
        System.out.println(T1.toString());
        T1.AjouterHeur(1);
        System.out.println(T1.toString());
        T1.AjouterMinute(40);
        System.out.println(T1.toString());
        T1.AjouterSeconde(4);
        System.out.println(T1.toString());
    }
}
class Temps{
    private int h;
    private int m;
    private int s;
    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public Temps(){
    }
    public Temps(int h){
        this.h=h;
    }
    public Temps(int h,int m){
        this(h);
        this.m=m;
    }
    public Temps(int h,int m,int s){
        this(h,m);
        this.s=s;
    }
    Temps(Temps temps){
        this(temps.getS(), temps.getM(), temps.getH());
    }
    public int AjouterHeur(int dh){
        return h=h+dh;
    }
    public int AjouterMinute(int dm){
        return m=m+dm;
    }
    public int AjouterSeconde(int ds){
        return s=s+ds;
    }

    @Override
    public String toString() {
        return "le temps est: "+h+":"+m+":"+s;

    }
}