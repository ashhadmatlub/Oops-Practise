package Practice.Constructors;

public class Student {
    private String name;
    private double roll_no;
    private int marks;

    // First we would make null cons.
    public Student() {
        this.name = "Unknown";
        this.roll_no = 0;
        this.marks = 0;
    }

    // PARA... Const..
    public Student(String name, double roll_no, int marks) {
        this.name = name;
        this.marks = marks;
        this.roll_no = roll_no;
    }

    // Copy
    public Student(Student s2) {
        this.name = s2.name;
        this.roll_no = s2.roll_no;
        this.marks = s2.marks;
    }

    // GETTERS AND SETTERS
    public void set_Student_Info(String name, double roll_no, int marks) {
        this.name = name;
        this.marks = marks;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public double getRoll_no() {
        return roll_no;
    }

    @Override
    public String toString() {
        return "Student{  name =  " + name + " roll num = " + roll_no + " marks = " + marks + " } ";
    }
}
