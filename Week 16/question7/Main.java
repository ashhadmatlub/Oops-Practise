package question7;

public class Main {
    public static void main(String[] args) {
        F f = new F();

        System.out.println("f.m() = " + f.m());
        System.out.println("f.n() = " + f.n());
        System.out.println("f.o() = " + f.o());

        E e = new E() {
            // it would creates an anonymous sub class because E is abstract class ( incomplete class ) so we cant access 
            // an incomplete class so it becomes the child class of that E class and inherits the method of it and its 
            // parents
        };

        System.out.println("E.m() = " + e.m());
        System.out.println("E.n() = " + e.n());
        System.out.println("E.o() = " + e.o());

        C c = new F();

        System.out.println("c.m() =  " + c.m());
        System.out.println("c.n() =  " + c.n());

        // to call o we must needs to type cast c into F; parent into child
        // F c1 = (F) c;
        // c = c1;
        // this will not work

        System.out.println("c.o() = " + ((F) c).o());
    }
}

