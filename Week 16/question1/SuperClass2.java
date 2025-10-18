package question1;

public class SuperClass2 {
    public SuperClass2() {
        System.out.println("This is super class NO arg cons ");
    }

    // so this is the parent class in which i had two cons : Default and Para
    // if we leave this class empty so the compiler would automatically creates a
    // null cons which would be called by its child implicitly
    // means we do not have to write super() in the child cons
    // but if in this class there is only a Para cons and copy cons and there will
    // be no default cons so the compiler would'nt create any default cons
    // implicitly so we must need to write explicitly super(arg) in the child cons
    // or the compiler would give compile time error.

    public SuperClass2(int arg) {
        System.out.println("The following argument was " + arg);
    }

    public SuperClass2(SuperClass2 other) {
        System.out.println("Copy cons ");
    }
}
