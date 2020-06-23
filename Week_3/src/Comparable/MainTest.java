package Comparable;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice;
        do {
            System.out.println("---------------------");
            System.out.println("|--------MENU-------|");
            System.out.println("| 1. Add student.   |");
            System.out.println("| 2. Search student |");
            System.out.println("| 3. Delete student |");
            System.out.println("| 4. Show student   |");
            System.out.println("| 0. Exit           |");
            System.out.println("---------------------");
            System.out.printf("Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    studentManager.search();
                    break;
                case 3:
                    System.out.println("Enter ID Wanted Delete ");
                    int id = sc.nextInt();
                    studentManager.deleteStudent(id);
                    break;
                case 4:
                    studentManager.showStudent();
            }
        } while (choice != 0);
    }
}
