class vehicle{
    protected 
    String regnNumber;
    int speed;
    String color;
    String ownerName;

    public vehicle(String regnNumber, int speed,String color,String ownerName){
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is a vehicle class");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);

    }
}

class Bus extends vehicle {
    private String routeNumber;

    public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    public void showData() {
        super.showData();
        System.out.println("Route Number: " + routeNumber);
    }

}

class Car extends vehicle {
    private String manufacturerName;

    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    public void showData() {
        super.showData();
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}



public class testvehicle {
    public static void main(String[] args) {
        Bus bus = new Bus("1234", 60, "Red", "John cena", "15A");
        Car car = new Car("5678", 120, "Blue", "Jack spparow", "Toyota");

        bus.showData();
        System.out.println();
        car.showData();
    }
}
    

