package Lab_Assignment_Inheritance;

public class Student extends Person{
    private String studentNumber;

    public Student(int age, String name, String studentNumber) {
        super(age, name);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }
    public void print(){
        System.out.println("Student\t"+ studentNumber);
    }
}
