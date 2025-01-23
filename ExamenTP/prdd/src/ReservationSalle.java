class ReservationSalle extends Reservation {
    private String salle;

    public ReservationSalle(int idReservation, String nomClient, String dateReservation, String salle) {
        super(idReservation, nomClient, dateReservation);
        this.salle = salle;
    }

    @Override
    public void validerReservation() throws Exception {
        if (salle.equalsIgnoreCase("Salle A") && dateReservation.equals("01/12")) {
            throw new Exception("La salle " + salle + " n'est pas disponible le " + dateReservation);
        }
        if (salle.equalsIgnoreCase("Salle B") && dateReservation.equals("03/12")) {
            throw new Exception("La salle " + salle + " n'est pas disponible le " + dateReservation);
        }
        if (salle.equalsIgnoreCase("Salle C") && dateReservation.equals("10/12")) {
            throw new Exception("La salle " + salle + " n'est pas disponible le " + dateReservation);
        }
    }

    @Override
    public String toString() {
        return "Reservation [ID: " + idReservation + ", Client: " + nomClient + 
               ", Date: " + dateReservation + ", Salle: " + salle + "]";
    }
}
