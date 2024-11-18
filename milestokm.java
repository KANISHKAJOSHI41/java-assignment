import java.util.Scanner;
class milestokm{
    public static void main(String[] args) {
        double miles,kilometer;
        Scanner sc = new Scanner(System.in);
        miles=sc.nextDouble();
        kilometer=miles*1.609;
        System.out.println("miles to kilometer"+ " "+ miles + "to" + kilometer);

    }
}
