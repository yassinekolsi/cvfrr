import java.util.*;

class Vehicle {
    protected int getSpeed() {
        return -1; // Vitesse par défaut (arbitraire)
    }
}

class Care extends Vehicle {
    public int getSpeed() {
        return 60; // Vitesse d'une voiture standard
    }
}

class RaceCare extends Care {
    public int getSpeed() {
        return 120; // Vitesse d'une voiture de course
    }
}

public class App{
    public static void main(String[] args) {
        Care v = new RaceCare(); // On crée un objet de type RaceCar, mais on le référence par Vehicle
        System.out.println("speed=" + v.getSpeed());
    }
}
