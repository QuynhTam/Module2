import java.util.Scanner;

public class maxArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        int row = sc.nextInt();
        System.out.println("Nhập số cột");
        int columm = sc.nextInt();
        int[][] arrMatrix = new int[row][columm];
        for (int i = 0; i < arrMatrix.length; i++) {
            for (int j = 0; j < arrMatrix[i].length; j++) {
                arrMatrix[i][j] = (int) (Math.random() * 100 + 1);
                System.out.print(arrMatrix[i][j] + " ");
            }
            System.out.println();
        }
        //Tìm max
        int max = arrMatrix[0][0];
        int indexa = 0;
        int indexb = 0;
        for (int i = 0; i < arrMatrix.length; i++) {
            for (int j = 0; j < arrMatrix[i].length; j++) {
                if (max < arrMatrix[i][j]) {
                    max = arrMatrix[i][j];
                    indexa = i;
                    indexb = j;
                }
            }
        }
        System.out.println(max + " tại vị trí [" + indexa + "][" + indexb + "]");
    }
}
