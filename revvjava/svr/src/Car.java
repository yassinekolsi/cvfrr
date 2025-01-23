public abstract class Car {
    float height;
    float weight;
    int numberwheels;
    
    public Car() {
    }
    public Car(float height, float weight, int numberwheels) {
        this.height = height;
        this.weight = weight;
        this.numberwheels = numberwheels;
    }
    abstract void autopilot();
    abstract void streamingServices();
    abstract void parkingSensors();
}
