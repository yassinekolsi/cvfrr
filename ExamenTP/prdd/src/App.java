import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez l'ID de réservation : ");
            int idReservation = scanner.nextInt();
            scanner.nextLine(); 


            System.out.print("Entrez le nom du client : ");
            String nomClient = scanner.nextLine();

            System.out.print("Entrez la date de réservation (format JJ/MM) : ");
            String dateReservation = scanner.nextLine();

            System.out.print("Entrez la salle souhaitée : ");
            String salle = scanner.nextLine();

            ReservationSalle reservation = new ReservationSalle(idReservation, nomClient, dateReservation, salle);
            try {
                reservation.validerReservation();
                System.out.println("Réservation acceptée : " + reservation);
            } catch (Exception e) {
                System.out.println("Réservation refusée : " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Erreur lors de l'entrée des données : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
