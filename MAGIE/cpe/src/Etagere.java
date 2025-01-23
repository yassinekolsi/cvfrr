public class Etagere {
    static final int max=2;
    Livre[]livres=new Livre[max];
    public void ajoutelivre(Livre livre) throws EtagerePleineException{
        if(Livre.nbLivres<livres.length){
            livres[Livre.nbLivres]=livre;
            Livre.nbLivres++;
        }
        else throw new EtagerePleineException(livre.titre);
    }
}
