package CodeGym.Thuchanh;

public class Execute {
    public static void main(String[] args) {
        Studens.change();
        Studens s1 = new Studens(111, "Hai");
        Studens s2 = new Studens(222, "ba");
        Studens s3 = new Studens(333, "bon");
        s1.display();
        s2.display();
        s3.display();
    }
}
