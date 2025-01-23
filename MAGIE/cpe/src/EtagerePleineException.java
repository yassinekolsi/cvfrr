public class EtagerePleineException extends Exception {
    public EtagerePleineException(String m){
        super(m);
    }    
    public EtagerePleineException(){
    }
    public String toString(){
        return "L etagere ne peut contenir que" + Etagere.max+"livres"+super.getMessage();
    }
}
