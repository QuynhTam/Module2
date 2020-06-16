package interfaceResizeable;

public class MainExecute {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area befor :");
        System.out.println(square.getAreaRetanle());
        square.resize(10);
        System.out.println("Area after :");
        System.out.println(square.getAreaRetanle());

//        Circle circle=new Circle();
//        System.out.println(circle.getArea());
//        circle.resize(100);
//        System.out.println(circle.getArea());
        Rectangle rectangle =new Rectangle(4,5);
        System.out.println("Area befor :");
        System.out.println(rectangle.getAreaRetanle());
        System.out.println("Area after :");
        rectangle.resize(100);
        System.out.println(rectangle.getAreaRetanle());


    }
}
