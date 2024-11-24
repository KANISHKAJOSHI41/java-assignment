class Distance {
    protected double miles;
    public Distance(double miles) {
        this.miles = miles;
    }

    public void travelTime() {
        double speed = 60.0; 
        double time = miles / speed;
        System.out.printf("Time taken to cover %.2f miles at %.2f mph: %.2f hours%n", miles, speed, time);
    }
}
class DistanceMKS extends Distance {
    public DistanceMKS(double kilometers) {
        super(kilometers / 1.60934); // Convert kilometers to miles
    }
    @Override
    public void travelTime() {
        double kilometers = miles * 1.60934; // Convert miles back to kilometers
        double speed = 100.0; // Speed in kilometers per hour
        double time = kilometers / speed;
        System.out.printf("Time taken to cover %.2f kilometers at %.2f km/h: %.2f hours%n", kilometers, speed, time);
    }
}

public class distance {
    public static void main(String[] args) {
        Distance distInMiles = new Distance(120); // Distance in miles
        distInMiles.travelTime();
        System.out.println();
        DistanceMKS distInKilometers = new DistanceMKS(200); 
        distInKilometers.travelTime();
    }
}
