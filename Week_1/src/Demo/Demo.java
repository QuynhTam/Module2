package Demo;

public class Demo {
    int rollno;
    String name;
  String college = "BachKhoa";

    Demo(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
