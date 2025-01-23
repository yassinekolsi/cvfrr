public class Satellite {
    double distance;
    double duree;
    double vitesse;
    public Satellite(){}
    public Satellite(double distance,double duree){
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
        Satellite s1=new Satellite(4,5);
        System.out.println(s1.getVitesse());
    }
}
