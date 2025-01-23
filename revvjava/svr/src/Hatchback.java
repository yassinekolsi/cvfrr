public abstract class Hatchback extends Car {
    public Hatchback(){
        System.out.println("hi");
    }
    public Hatchback(float height,float weight,int numberwheels){
        super(height, weight, numberwheels);
    }
    @Override
    void autopilot() {
        System.out.println("autopilot");
        
    }

    @Override
    void parkingSensors() {
        System.out.println("parkingsensors");
        
    }

    @Override
    void streamingServices() {
        System.out.println("streaming services");
        
    }
}
