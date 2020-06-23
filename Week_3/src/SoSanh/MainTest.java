package SoSanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student(1, "quynh", 30);
        Student student1 = new Student(2, "hai", 31);
        Student student2 = new Student(3, "tung", 26);
        Student student3 = new Student(4, "tuyen", 25);
        Student student4 = new Student(5, "nghia", 31);
        Student student5 = new Student(6, "hiep", 30);
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        for (Student x : studentList) {
            System.out.println(x.getName());
        }
        Collections.sort(studentList);
        for (Student x : studentList) {
            System.out.println(x.getName());
        }
        Collections.sort(studentList, (o1, o2) -> (o1.getAge() - o2.getAge()));
        for (Student x : studentList) {
            System.out.println(x.getAge());
        }
    }
}
