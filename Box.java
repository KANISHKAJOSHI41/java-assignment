public class Box {
    
        double width, height, depth;
    
        // Constructor used when all dimensions are specified
        public Box(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }
    
        // Default constructor
        public Box() {
            width = height = depth = 0;
        }
    
        // Constructor used when creating a cube
        public Box(double len) {
            width = height = depth = len;
        }
    
        // Method to compute and return volume
        public double volume() {
            return width * height * depth;
        }
    
        public static void main(String[] args) {
            // Creating boxes using different constructors
            Box mybox1 = new Box(10, 20, 15);
            Box mybox2 = new Box();
            Box mycube = new Box(7);
    
            // Displaying volumes of the boxes
            System.out.println("Volume of mybox1 is " + mybox1.volume());
            System.out.println("Volume of mybox2 is " + mybox2.volume());
            System.out.println("Volume of mycube is " + mycube.volume());
        }
    }
    
