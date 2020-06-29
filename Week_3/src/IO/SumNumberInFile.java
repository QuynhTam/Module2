package IO;

import java.io.*;
import java.util.Scanner;

public class SumNumberInFile {
    public static void main(String[] args) {
        System.out.printf("Enter file path : ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        readFileText(path);
    }

    public static void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader rd = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = rd.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            rd.close();
            System.out.printf("Sum : " + sum);

        } catch (Exception e) {
            System.out.printf("Not found file !");
        }
    }
}
