import java.util.Scanner;

public class minElementArr {
    public static void main(String[] args) {
        int arrMin[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số dòng");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột");
        int columms = sc.nextInt();
        arrMin = new int[rows][columms];
        for (int i = 0; i < arrMin.length; i++) {
            for (int j = 0; j < arrMin[i].length; j++) {
                arrMin[i][j] = (int) (Math.random() * 100);
                System.out.print(arrMin[i][j] + " ");
            }
            System.out.println();
        }
        int min = arrMin[0][0];
        int indexRows = 0;
        int indexColumm = 0;
        for (int i = 0; i < arrMin.length; i++) {
            for (int j = 0; j < arrMin[i].length; j++) {
                if (min > arrMin[i][j]) {
                    min = arrMin[i][j];
                    indexRows = i;
                    indexColumm = j;
                }
            }
        }
        System.out.println("Số nhỏ nhất là : " + min + " Tại vị trí : [" + indexRows + "][" + indexColumm + "]");
    }
}
