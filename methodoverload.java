import java.util.Scanner;
public class methodoverload {
    // calculator

    public int add(int a,int b){
        System.out.println(a+b);
        return a+b;
    }

    
    public double add(double v,double k ){
        System.out.println(v+k);
        return v+k;
    }

    
    public int add(int a, int b, int c){
        System.out.println(a+b+c);
        return a+b+c;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int  a= sc.nextInt();
       int b= sc.nextInt();
       int c= sc.nextInt();
       double v=sc.nextDouble();
       double k= sc.nextDouble();

        methodoverload obj = new methodoverload();
        obj.add(a, b);
        obj.add(v, k);
        obj.add(a, b, c);
    }
}
