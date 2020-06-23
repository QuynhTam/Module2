package Comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    Scanner sc = new Scanner(System.in);
    List<Student> studentList;

    public StudentManager() {
        this.studentList = new ArrayList<Student>();
    }

    public void addStudent() {
        boolean check = true;
        System.out.printf("Enter ID: ");
        int id = sc.nextInt();
        System.out.printf("Enter Name: ");
        String name = sc.next();
        System.out.printf("Enter Age: ");
        int age = sc.nextInt();
        Student student = new Student(id, name, age);
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                check = false;
            }
        }
        if (check) {
            studentList.add(student);
        } else
            System.out.println("ID existed !");
    }

    public void search() {
        System.out.printf("1. id");
        System.out.printf(" 2. name");
        System.out.printf(" 3. age");
        System.out.printf(" - Choice : ");
        int choice = sc.nextInt();
        boolean check = true;
        switch (choice) {
            case 1:
                System.out.printf("Enter id :");
                int id = sc.nextInt();
                for (int i = 0; i < studentList.size(); i++) {
                    if (id == studentList.get(i).getId()) {
                        System.out.println(studentList.get(i).toString());
                        check = false;
                    }
                }
                if (check)
                    System.out.println("Not existed");
                break;
            case 2:
                System.out.printf("Enter name :");
                String name = sc.next();
                for (int i = 0; i < studentList.size(); i++) {
                    if (name.equals(studentList.get(i).getName())) {
                        System.out.println(studentList.get(i).toString());
                        check = false;
                    }
                }
                if (check)
                    System.out.println("Not existed");
                break;
            case 3:
                System.out.printf("Enter age :");
                int age = sc.nextInt();
                for (int i = 0; i < studentList.size(); i++) {
                    if (age == studentList.get(i).getAge()) {
                        System.out.println(studentList.get(i).toString());
                        check = false;
                    }
                }
                if (check)
                    System.out.println("Not existed");
                break;
        }
    }

    public void deleteStudent(int id) {
        Student student = null;
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                student = studentList.get(i);
                break;
            }
        }
        if (student != null) {
            studentList.remove(student);
        } else
            System.out.println("Not existed");
    }

    public void showStudent() {
        for (Student student : studentList) {
            System.out.println(student.toString());
            System.out.println();
        }
    }
}
