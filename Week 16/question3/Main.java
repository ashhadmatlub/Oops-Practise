package question3;

public class Main {
    public static void main(String[] args) {

        Stuff s = new Stuff("in", 5);
        System.out.println(s);

        double doubleValue = 2.5;

        s.doSomething(doubleValue);

        s = new Stuff("more ", 3);

        String str = "words";

        System.out.println(s.changeSomething(str));

        System.out.println(s);
        System.out.println(str);
    }
}
