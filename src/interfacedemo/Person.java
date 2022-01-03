package interfacedemo;

//Custom marker interface
public interface Person {
}

class Student implements Person{
    void present(){
        System.out.println("Student is Present");
    }
}
class StudentImpl{
    public static void main(String[] args) {
       Student student = new Student();
       student.present();
    }
}