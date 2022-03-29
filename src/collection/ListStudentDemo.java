package collection;

import java.util.ArrayList;
import java.util.List;

public class ListStudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.address = "";
        s1.rollNo = 1;
        s1.section = "";
        s1.studName = "";
        students.add(s1);
        for (Student s : students){
            System.out.println(s.toString());
        }
    }
}
class Student{
    Integer rollNo;
    String studName;
    String section;
    String address;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", studName='" + studName + '\'' +
                ", section='" + section + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
