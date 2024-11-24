import java.util.Scanner;

abstract class ThreeDobject
{
abstract double wholeSurfaceArea();
abstract double volume();
}

class Box extends ThreeDobject{
    double l,w,h;

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
     }

    @Override
     double wholeSurfaceArea(){
        return 2*(l*w+w*h+h*l);
     }
    

    @Override
    double volume() {
        return l * w * h;
    }

}
class Cube extends ThreeDobject{
    double a;

     Cube(double a) {
        this.a=a;
    }
    double wholeSurfaceArea(){
        return 6*a*a;
     }
    

    double volume() {
        return a * a * a;
    }

    
}

class Cylinder extends ThreeDobject{
    double r,h;

    Cylinder(double r, double h){
        this.r= r;
        this.h= h;
    }
    double wholeSurfaceArea(){
        return 2*3.14*r*(r+h);
     }
    

    double volume() {
        return 3.14 * r * r * h;
    }
}

class Cone extends ThreeDobject{
    double r,h;

    Cone(double r, double h){
        this.r= r;
        this.h= h;
    }

double wholeSurfaceArea() {
    double slantHeight = Math.sqrt(r * r + h * h);
    return 3.14 * r * (r + slantHeight);
}
double volume() {
    return 3.14 * r * r * h / 3;
}
}

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for Box (length width height):");
        Box box = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        System.out.println("Enter side length for Cube:");
        Cube cube = new Cube(sc.nextDouble());
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        System.out.println("Enter dimensions for Cylinder (radius height):");
        Cylinder cylinder = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        System.out.println("Enter dimensions for Cone (radius height):");
        Cone cone = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());
        
    }
    
}
