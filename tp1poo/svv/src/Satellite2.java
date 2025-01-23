import java.util.Scanner;
public class Satellite2 {
    double distance;
    double duree;
    double vitesse;
    public Satellite2(){
        Scanner x=new Scanner(System.in);
        System.out.println("saisir distance ");
        distance=x.nextDouble();
        System.out.println("saisir duree ");
        duree=x.nextDouble();
        vitesse=distance/duree;
    }
    public Satellite2(double distance,double duree){
        this.distance=distance;
        this.duree=duree;
        this.vitesse=distance/duree;
    }
    public double getVitesse(){ return vitesse;}
    
    @Override
    public String toString() {
        return "Satellite [distance=" + distance + ", duree=" + duree + ", vitesse=" + vitesse + "]";
    }
    public static void main(String[] args){
        Satellite2 s1=new Satellite2();
        System.out.println(s1);
    }
}
