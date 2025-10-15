import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

// similiarly doing the comparision on the basis of an ADT

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name " + name + " Age : " + age;
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;

    }
}

public class Demo {
    public static void main(String[] args) {

        // here we would learn about comparator and comparable these two are the
        // interfaces of java
        // collection and both of them basically used in sorting

        // Comparator<Integer> coms = new Comparator<Integer>() {
        // public int compare(Integer i, Integer j) {
        // if (i % 10 > j % 10)
        // return 1;
        // else
        // return -1;
        // }
        // };

        // Comparator<Student> com = new Comparator<Student>() {

        // public int compare(Student i, Student j) {
        // if (i.getAge() > j.getAge())
        // return 1;
        // else
        // return -1;
        // }
        // };

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(10, "Ashhad"));
        stud.add(new Student(19, "ahemd"));
        stud.add(new Student(3, "anas"));
        stud.add(new Student(98, "ali"));

        // List<Integer> nums = new ArrayList<>();
        // nums.add(90);
        // nums.add(345);
        // nums.add(63);
        // nums.add(34);
        // nums.add(23);

        // now what if we wants to sort them on the basis of there last digit like 0 ,
        // 5, 3, like this way

        Collections.sort(stud);

        for (Student std : stud)
            System.out.println(std);
    }
}
