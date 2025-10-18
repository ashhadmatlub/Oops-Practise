package question1;

public class SubClass2 extends SuperClass2 {

    public SubClass2() {
        // here we needs to call the super keyword in only cases given below
        // 1. If the parent class had no Null cons and it must has Para cons or copy
        // cons

        super(0);
        System.out.println("This is the subclass constructor");
    }
}
