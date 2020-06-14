package CodeGym.TH_kethua;

public class MainExecute {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
        Cirle c1 = new Cirle(3.5);
        System.out.println(c1);
        c1 = new Cirle("blue", true, 10);
        System.out.println(c1);
        Rectangle r1=new Rectangle();
        System.out.println(r1);
        r1 = new Rectangle(2.3, 5.8);
        System.out.println(r1);
        r1 = new Rectangle("orange", false, 5, 6);
        System.out.println(r1);
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow", true, 5.8);
        System.out.println(square);
    }
}
