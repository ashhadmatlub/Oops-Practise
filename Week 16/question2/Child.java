package question2;

public class Child extends Parent {
    static int u = 5;

    public void r(int v) {
        System.out.println(y = v); // y comes from the Parent class
        System.out.println(u = 8);
    }

    @Override
    public void show() {
        System.out.println("Child ");
    }
}
