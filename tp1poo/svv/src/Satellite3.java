public class Satellite3 {
    private float masse;
    private float vitesse;
    private String nomSatellite;
    public Satellite3(float m,float vit,String nomS){
        masse=m;
        vitesse=vit;
        nomSatellite=nomS;
    }
    void impulsion(float force,float duree){
        System.out.println("l'impulsion est:"+force*duree/masse);

    }
    void energie(){
        System.out.println("l'energie est:"+masse*vitesse*vitesse/2);
    }
    public static void main(String[] args){
        Satellite3 sat=new Satellite3(4,5,"ploto");
        sat.impulsion(5, 14);
        sat.energie();

    }
}
