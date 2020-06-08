import java.util.Scanner;

public class DisplayHi {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("What your name? ");
        name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
