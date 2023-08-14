package Vehicle;

public class Car {
    String make;
    String model;
    int year;

    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println("Car goes");
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
