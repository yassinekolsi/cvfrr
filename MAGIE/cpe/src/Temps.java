public class Temps {
    private int h, min, sec;


    // Constructeur modifié pour gérer les exceptions
    public Temps(int h, int m, int s) throws TempsException {
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            throw new TempsException("Heure, minute ou seconde invalide");
        }
        this.h = h;
        this.min = m;
        this.sec = s;
    }
    public Temps(String s) throws TempsException{
        String[]elem=s.split(":");
        if(elem.length!=3){
            throw new TempsException("FORMAT DE CH INCOR");
        }
            int h=Integer.parseInt(elem[0]);
            int m=Integer.parseInt(elem[1]);
            int se=Integer.parseInt(elem[2]);
            if (h < 0 || h > 23 || m < 0 || m > 59 || se < 0 || se > 59) {
                throw new TempsException("Heure, minute ou seconde invalide");
            }
            this.h = h;
            this.min = m;
            this.sec = se;
    
    }

    // Définition de la classe d'exception
    public static class TempsException extends Exception {
        public TempsException(String message) {
            super(message);
        }
    }
}