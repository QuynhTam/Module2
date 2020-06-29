package IO;

import java.io.*;

public class CoppyFile {
    public static void main(String[] args) throws IOException {
        try {
            File file1 = new File("file1.txt");
            File file2 = new File("file2.txt");
            if (!file1.exists())
                file1.createNewFile();
            if (!file2.exists())
                file2.createNewFile();
            FileReader fileReader = new FileReader(file1);
            FileWriter fileWriter = new FileWriter(file2);
            int c;
            while ((c = fileReader.read()) != -1) {
                fileWriter.write(c);
            }
            System.out.println("File is copied successful!");
            fileReader.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.printf("Có lỗi");
        }
    }
}
