class Num {
    protected int number;
    public Num(int number) {
        this.number = number;
    }
    public void shownum() {
        System.out.println("Number: " + number);
    }
}
class HexNum extends Num {

    public HexNum(int number) {
        super(number);
    }
    @Override
    public void shownum() {
        System.out.println("Number: " + number);
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}
public class NUM {
    public static void main(String[] args) {
        Num num = new Num(123);
        HexNum hexNum = new HexNum(123);

        System.out.println("Displaying from Num class:");
        num.shownum();

        System.out.println("\nDisplaying from HexNum class:");
        hexNum.shownum();
    }
}
