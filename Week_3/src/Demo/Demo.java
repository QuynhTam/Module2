package Demo;

public class Demo {
    public static void main(String[] args) {
        String[] a = {"abc", "def", "ghd"};
        String[] b = {"fed", "dhgf", "cba"};
        System.out.println(femat(a, b));
        femat(a, b);
    }

    public static boolean femat(String[] arr, String[] a) {
        boolean check = false;
        String b = a.toString();
        String d = arr.toString();
        for (int i = 0; i < b.length()-1; i++) {
            check = false;
            for (int j = 0; j < b.length()-1; j++) {
                if (b.charAt(i) == d.charAt(j)) {
                    check = true;
                    break;
                }
            }
        }
        return check;
    }
}
