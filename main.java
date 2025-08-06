package Practice.Constructors;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student() ; 
        System.out.println(s1);

        // after setting the values manually in null constructor 
        s1.set_Student_Info("ahmed", 2000, 203);
        System.out.println(s1);


        // PARA CONS..
        Student s2 = new Student( "ashhad " , 2344 , 210 );
        System.out.println(s2);

        // COPY CONS ... 
        Student s3 = new Student(s2);
        System.out.println(s3);

        s3.set_Student_Info("ali", 452, 34);
        System.out.println(s3);
    }
}
