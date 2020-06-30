package IO;

import java.util.Scanner;
import java.io.*;

public class Mains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter source file: ");
        String destPath = scanner.nextLine();
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try {
            CoppyFileBig coppyFileBig = new CoppyFileBig();
            coppyFileBig.copyFileUsingJava7Files(sourceFile, destFile);
            System.out.println("Copy Complate !");
        } catch (IOException e) {
            System.out.println("Can't coppy that file !");
            System.out.println(e.getMessage());
        }
    }
}
