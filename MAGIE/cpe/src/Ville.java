public class Ville{
    String nomVille;
    String nomPays;
    int nbrehabitant;
    public Ville(String pnom,int Pnbre,String pPays) throws NbreHabitantException{
        if(Pnbre<0){
            throw new NbreHabitantException();
        }
        else{
            nomVille=pnom;
            nomPays=pPays;
            nbrehabitant=Pnbre;
        }
    }
}
