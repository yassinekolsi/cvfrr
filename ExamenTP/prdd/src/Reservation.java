abstract class Reservation {
    protected int idReservation;
    protected String nomClient;
    protected String dateReservation;

    public Reservation(int idReservation, String nomClient, String dateReservation) {
        this.idReservation = idReservation;
        this.nomClient = nomClient;
        this.dateReservation = dateReservation;
    }

    public abstract void validerReservation() throws Exception;
}
